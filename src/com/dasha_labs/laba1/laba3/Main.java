package com.dasha_labs.laba1.laba3;

import com.dasha_labs.laba1.laba2.LedMonitor;
import com.dasha_labs.laba1.laba2.MatrixMonitor;
import com.dasha_labs.laba1.laba2.TubeMonitor;

public class Main {
    public static void main(String[] args){
        MyListImpl<String> myList = new MyListImpl<>();
        myList.add("Маленький Пиздун");
        myList.add("Пиздун");
        myList.add("Большой Пиздун");
        System.out.println(myList.size());
        Object[] s = myList.toArray();
        System.out.println(s.length);
        System.out.println(myList.contains("Пиздун"));
    }
}
