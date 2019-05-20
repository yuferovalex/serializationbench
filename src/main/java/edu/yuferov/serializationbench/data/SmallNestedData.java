package edu.yuferov.serializationbench.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SmallNestedData extends PlainData implements Serializable {
    private static final long serialVersionUID = 2955772576025346945L;

    private PlainData[] data = {
            new PlainData(), new PlainData(),
            new PlainData(), new PlainData(),
            new PlainData(), new PlainData(),
            new PlainData(), new PlainData(),
            new PlainData(), new PlainData()
    };
}
