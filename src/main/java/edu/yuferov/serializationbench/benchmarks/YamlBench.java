package edu.yuferov.serializationbench.benchmarks;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class YamlBench extends BenchBase {
    private YAMLMapper mapper = new YAMLMapper();

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
