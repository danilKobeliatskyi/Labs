package com.dasha_labs.laba1.laba1;

public class Laba1 {
    VarA vara = new VarA();
    double a = vara.ofA();
    VarB varb = new VarB();
    double b = varb.ofB();

    public void resultOfFunction(){
        ValueXAndY xAndY = new ValueXAndY(a,b);
    }
}
