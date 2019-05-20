package edu.yuferov.serializationbench.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class MediumNestedData extends PlainData implements Serializable {
    private static final long serialVersionUID = 4590825042786853020L;

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
