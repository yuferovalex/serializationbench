package edu.yuferov.serializationbench.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class BigNestedData extends PlainData implements Serializable {
    private static final long serialVersionUID = -4981443075230633191L;

    private MediumNestedData[] mediumNestedData = {
            new MediumNestedData(), new MediumNestedData(),
            new MediumNestedData(), new MediumNestedData(),
            new MediumNestedData(), new MediumNestedData(),
            new MediumNestedData(), new MediumNestedData(),
            new MediumNestedData(), new MediumNestedData()
    };
}
