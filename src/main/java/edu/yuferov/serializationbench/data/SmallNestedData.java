package edu.yuferov.serializationbench.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SmallNestedData extends PlainData {
    private PlainData[] data = {
            new PlainData(), new PlainData(),
            new PlainData(), new PlainData(),
            new PlainData(), new PlainData(),
            new PlainData(), new PlainData(),
            new PlainData(), new PlainData()
    };
}
