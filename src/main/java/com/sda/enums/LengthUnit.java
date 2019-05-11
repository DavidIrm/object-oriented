package com.sda.enums;

/*
    Tip referinta specific, care accepta o lista
    predefinita de valori
 */
public enum LengthUnit {
    //name/value(s)
    CENTIMETER(0.00001),
    METER(0.001),
    DECIMETER(0.01),
    KILOMETER(1);

    double modifier;

    LengthUnit(double modifier) {
        this.modifier = modifier;
    }
}
