package edu.yuferov.serializationbench.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MediumNestedData extends PlainData {
    private SmallNestedData[] smallNestedData = {
            new SmallNestedData(),
            new SmallNestedData(),
            new SmallNestedData(),
            new SmallNestedData(),
            new SmallNestedData(),

            new SmallNestedData(),
            new SmallNestedData(),
            new SmallNestedData(),
            new SmallNestedData(),
            new SmallNestedData()
    };
}
