package com.dasha_labs.laba1.laba3;

import com.dasha_labs.laba1.laba2.LedMonitor;
import com.dasha_labs.laba1.laba2.MatrixMonitor;
import com.dasha_labs.laba1.laba2.TubeMonitor;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        TubeMonitor tube = new TubeMonitor();
        LedMonitor led = new LedMonitor();
        MatrixMonitor matrix = new MatrixMonitor();

        MyListImpl<TubeMonitor> myList = new MyListImpl<>();
        myList.add(tube);
        myList.add(led);
        myList.add(matrix);
        System.out.println(myList.contains(led));

        for (Object o : myList)
            System.out.println(o);

        Iterator<TubeMonitor> it = myList.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
