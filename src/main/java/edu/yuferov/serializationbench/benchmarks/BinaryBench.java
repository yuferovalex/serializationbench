package edu.yuferov.serializationbench.benchmarks;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BinaryBench extends BenchBase {
    public BinaryBench() {
        super(null);
    }

    @Override
    public byte[] serializeData(ObjectMapper mapper, Object data) throws Exception {
        ByteArrayOutputStream outputByteStream = new ByteArrayOutputStream();
        ObjectOutputStream outputObjectStream = new ObjectOutputStream(outputByteStream);
        outputObjectStream.writeObject(data);
        return outputByteStream.toByteArray();
    }

    @Override
    public Object deserializeData(ObjectMapper mapper, byte[] data, Class clazz) throws Exception {
        ByteArrayInputStream inputByteStream = new ByteArrayInputStream(data);
        ObjectInputStream inputObjectStream = new ObjectInputStream(inputByteStream);
        return inputObjectStream.readObject();
    }
}
