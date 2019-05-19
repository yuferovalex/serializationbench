package edu.yuferov.serializationbench.benchmarks;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonBench extends BenchBase {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public String serializeData(Object data) throws Exception {
        return mapper.writeValueAsString(data);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object deserializeData(String data, Class clazz) throws Exception {
        return mapper.readValue(data, clazz);
    }
}
