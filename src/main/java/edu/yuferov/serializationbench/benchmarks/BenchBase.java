package edu.yuferov.serializationbench.benchmarks;

import org.openjdk.jmh.annotations.*;

@BenchmarkMode({ Mode.All })
@State(Scope.Benchmark)
public abstract class BenchBase {
    static class Data {
        Object object;
        Class clazz;
        String serialized;
    }

    @Param({
            "edu.yuferov.serializationbench.data.PlainData",
            "edu.yuferov.serializationbench.data.SmallNestedData",
            "edu.yuferov.serializationbench.data.MediumNestedData",
            "edu.yuferov.serializationbench.data.BigNestedData"
    })
    private String className;
    private Data currentData;

    @Setup(Level.Invocation)
    public void invocationSetup() throws Exception {
        currentData = new Data();
        currentData.clazz = Class.forName(className);
        currentData.object = currentData.clazz.newInstance();
        currentData.serialized = serializeData(currentData.object);
    }

    @Benchmark
    public final void serialize() throws Exception {
        serializeData(currentData.object);
    }

    @Benchmark
    public final void deserialize() throws Exception {
        deserializeData(currentData.serialized, currentData.clazz);
    }

    public abstract String serializeData(Object data) throws Exception;
    public abstract Object deserializeData(String data, Class clazz) throws Exception;
}
