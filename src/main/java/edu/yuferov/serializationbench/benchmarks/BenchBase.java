package edu.yuferov.serializationbench.benchmarks;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.*;

@BenchmarkMode(Mode.Throughput)
@State(Scope.Benchmark)
public abstract class BenchBase {
    static class Data {
        Object object;
        Class clazz;
        byte[] serialized;
    }

    @Param({
            "edu.yuferov.serializationbench.data.PlainData",
            "edu.yuferov.serializationbench.data.SmallNestedData",
            "edu.yuferov.serializationbench.data.MediumNestedData",
            "edu.yuferov.serializationbench.data.BigNestedData"
    })
    private String className;
    private Data currentData;
    private final ObjectMapper mapper;

    protected BenchBase(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Setup(Level.Trial)
    public void prepare() throws Exception {
        currentData = new Data();
        currentData.clazz = Class.forName(className);
        currentData.object = currentData.clazz.newInstance();
        additionalPreparation(mapper, currentData.clazz);
        currentData.serialized = serializeData(mapper, currentData.object);
    }

    public void additionalPreparation(ObjectMapper mapper, Class clazz) throws Exception {
    }

    @Benchmark
    public final byte[] serialize() throws Exception {
        return serializeData(mapper, currentData.object);
    }

    @Benchmark
    public final Object deserialize() throws Exception {
        return deserializeData(mapper, currentData.serialized, currentData.clazz);
    }

    public byte[] serializeData(ObjectMapper mapper, Object data) throws Exception {
        return mapper.writeValueAsBytes(data);
    }

    @SuppressWarnings({ "unchecked", "unused" })
    public Object deserializeData(ObjectMapper mapper, byte[] data, Class clazz) throws Exception {
        return mapper.readValue(data, clazz);
    }
}
