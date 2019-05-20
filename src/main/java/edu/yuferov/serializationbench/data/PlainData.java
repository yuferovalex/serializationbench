package edu.yuferov.serializationbench.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class PlainData implements Serializable {
    private static final long serialVersionUID = 3608089513761191944L;

    private Byte aByte = 0x00;
    private Character aChar = 'A';
    private Short aShort = 127;
    private Integer aInteger = 12345;
    private Long aLong = 123456789L;
    private Boolean aBoolean = Boolean.TRUE;
    private String aString = "Some sort of string";
    private String[] anStringArray = { "StringElement", "SomeAnotherElement" };
}
