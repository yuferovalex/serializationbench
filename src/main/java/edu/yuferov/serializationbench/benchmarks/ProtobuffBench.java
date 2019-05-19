package edu.yuferov.serializationbench.benchmarks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.protobuf.ProtobufMapper;
import com.fasterxml.jackson.dataformat.protobuf.schema.ProtobufSchema;

public class ProtobuffBench extends BenchBase {
    private ProtobufSchema protobufSchema;

    public ProtobuffBench() {
        super(new ProtobufMapper());
    }

    @Override
    public void additionalPreparation(ObjectMapper mapperRaw, Class clazz) throws Exception {
        ProtobufMapper mapper = (ProtobufMapper) mapperRaw;
        protobufSchema = mapper.generateSchemaFor(clazz);
    }

    @Override
    public byte[] serializeData(ObjectMapper mapper, Object data) throws Exception {
        return mapper
                .writer(protobufSchema)
                .writeValueAsBytes(data);
    }

    @Override
    public Object deserializeData(ObjectMapper mapper, byte[] data, Class clazz) throws Exception {
        return mapper
                .readerFor(clazz)
                .with(protobufSchema)
                .readValue(data);
    }
}
