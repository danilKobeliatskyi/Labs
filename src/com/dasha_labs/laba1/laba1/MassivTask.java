package com.dasha_labs.laba1.laba1;

import java.util.*;

public class MassivTask {
    Random rand = new Random();
    private List<Double> list = new ArrayList<>();
    private int[] vector = new int[16];
    private int min;
    private int max;

    MassivTask(){
        int f = rand.nextInt(30);
        min = - f - 15;
        max = f + 15;
    }

    public void arrayFilling(){
        List<Integer> maximum = new ArrayList<>();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(max - min) + min;
            if (vector[i] % 2 == 0){
                maximum.add(vector[i]);
            }
        }
        Collections.sort(maximum);
        int count = 0;
        for (int j = 0; j < vector.length; j ++){
            if (vector[j] % 2 == 0){
                vector[j] = maximum.get(count);
                count++;
            }
        }
        for (int k = 0; k < vector.length; k++){
            System.out.print(vector[k] + " ");
        }
    }
}

