package com.dasha_labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VarA {
    Random rand = new Random();
    private float variable1 = 0;
    private double a;
    private List<Double> listOfA = new ArrayList<>();

    public double ofA(){
        while (variable1 < 4){
            variable1 = variable1 + 0.1f;
            double resultOfA = dropFloat(variable1, 1);
            listOfA.add(resultOfA);
        }
        int aaa = rand.nextInt(41);
        a = listOfA.get(aaa);
        System.out.println("a = " + a);
        return a;
    }

    private double dropFloat (float value, int size){
        double mul = Math.pow(10, size);
        return ((long)(value * mul))/mul;
    }
}
