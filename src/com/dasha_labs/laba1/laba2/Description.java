package com.dasha_labs.laba1.laba2;

import java.util.Arrays;

public class Description {
    Description(){
        System.out.println("Описание мониторов: ");

        TubeMonitor tube = new TubeMonitor();
        MatrixMonitor matrix = new MatrixMonitor();
        LedMonitor led = new LedMonitor();

        System.out.println("\n");
        System.out.println(tube.toString());
        tube.size();
        tube.form();
        tube.quality();

        System.out.println("\n");
        System.out.println(led.toString());
        led.size();
        led.form();
        led.quality();

        System.out.println("\n");
        System.out.println(matrix.toString());
        matrix.size();
        matrix.form();
        matrix.quality();


        Object[] monitors = new Object[]{
                new TubeMonitor(),
                new LedMonitor(),
                new MatrixMonitor(),
                new TubeMonitor(),
                new MatrixMonitor(),
                new LedMonitor()
        };

        System.out.println("Массив обьектов мониторов: " + "\n");
        for (Object monitor : monitors)
            System.out.println(monitor);

            System.out.println("\n" + "Отсортированый масив:" + "\n");

        for (Object monitor : monitors) {
            Arrays.sort(monitors);
            System.out.println(monitor);
        }
    }
}

