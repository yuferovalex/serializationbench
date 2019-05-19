package edu.yuferov.serializationbench.benchmarks;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class YamlBench extends BenchBase {
    public YamlBench() {
        super(new YAMLMapper());
    }
}
