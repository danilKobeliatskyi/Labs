package com.dasha_labs.laba1.laba3;

import com.dasha_labs.laba1.laba2.LedMonitor;
import com.dasha_labs.laba1.laba2.MatrixMonitor;

public class Main {
    public static void main(String[] args){
        MyListImpl myList = new MyListImpl();
        LedMonitor led = new LedMonitor();
        MatrixMonitor matrix = new MatrixMonitor();
        myList.add(led);
        myList.add(matrix);
        System.out.println(myList.size());
        System.out.println(myList.get(1));
        myList.remove(1);
        myList.contains(led);
        myList.contains(matrix);
        myList.add(matrix);
        myList.add(matrix);
        myList.add(matrix);
        myList.add(matrix);
        myList.add(matrix);
        myList.toArray();
        myList.clear();
        System.out.println("\n");
        myList.add(led);
        myList.toArray();
    }
}
