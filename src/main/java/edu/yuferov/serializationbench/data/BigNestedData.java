package edu.yuferov.serializationbench.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BigNestedData extends PlainData {
    private MediumNestedData[] mediumNestedData = {
            new MediumNestedData(), new MediumNestedData(),
            new MediumNestedData(), new MediumNestedData(),
            new MediumNestedData(), new MediumNestedData(),
            new MediumNestedData(), new MediumNestedData(),
            new MediumNestedData(), new MediumNestedData()
    };
}
