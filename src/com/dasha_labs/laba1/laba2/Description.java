package com.dasha_labs.laba1.laba2;

import java.util.Arrays;

public class Description {
    private Selection selection = new Selection();
    private TubeMonitor o1;

    public void description(TubeMonitor o1){
        System.out.println("Описание " + o1 + ": ");
        System.out.println(o1.toString());
        o1.size();
        o1.form();
        o1.quality();
    }
}

