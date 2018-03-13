package com.dasha_labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VarB {
    Random rand = new Random();
    private float variable1 = -2;
    private double b;
    private List<Double> listOfB = new ArrayList<>();


    public double ofB(){
        while (variable1 < 5){
            variable1 = variable1 + 0.2f;
            double resultOfB = dropFloat(variable1, 1);
            listOfB.add(resultOfB);
        }
        int bbb = rand.nextInt(36);
        b = listOfB.get(bbb);
        System.out.println("b = " + b);
        return b;
    }

    private double dropFloat (float value, int size){
        double mul = Math.pow(10, size);
        return ((long)(value * mul))/mul;
    }
}
