package edu.yuferov.serializationbench.benchmarks;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonBench extends BenchBase {
    public JsonBench() {
        super(new ObjectMapper(new JsonFactory()));
    }
}
