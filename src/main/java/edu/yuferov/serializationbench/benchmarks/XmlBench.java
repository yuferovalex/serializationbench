package edu.yuferov.serializationbench.benchmarks;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlBench extends BenchBase {
    public XmlBench() {
        super(new XmlMapper());
    }
}
