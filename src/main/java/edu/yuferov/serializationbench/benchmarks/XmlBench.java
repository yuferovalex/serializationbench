package edu.yuferov.serializationbench.benchmarks;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlBench extends BenchBase {
    private XmlMapper mapper = new XmlMapper();

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
