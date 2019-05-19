package edu.yuferov.serializationbench.benchmarks;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.msgpack.jackson.dataformat.MessagePackFactory;

public class MsgPackBench extends BenchBase {
    public MsgPackBench() {
        super(new ObjectMapper(new MessagePackFactory()));
    }
}
