package com.dasha_labs.laba1.laba2;

import java.util.Arrays;

public class Description {
    Description(){
        TubeMonitor tube = new TubeMonitor();
        MatrixMonitor matrix = new MatrixMonitor();
        LedMonitor led = new LedMonitor();
        MonitorSize size = new MonitorSize();
        MonitorQuality quality = new MonitorQuality();

        System.out.println(tube.toString());
        tube.size();
        tube.form();
        tube.quality();

        System.out.println(led.toString());
        led.size();
        led.form();
        led.quality();

        System.out.println(matrix.toString());
        matrix.size();
        matrix.form();
        matrix.quality();


        Object[] monitors;
        monitors = new Object[]{
                new TubeMonitor(),
                new LedMonitor(),
                new MatrixMonitor(),
                new TubeMonitor(),
                new MatrixMonitor(),
                new LedMonitor()
        };

        System.out.println("\n" + "Отсортированый масив:" + "\n");

        for (int i = 0; i < monitors.length; i++) {
            Arrays.sort(monitors);
            System.out.println(monitors[i]);
        }


        System.out.println("\n");

        switch (led.compareTo(matrix)){
            case 0: System.out.println("Цена мониторов одинакова");
                break;
            case 1: System.out.println("Этот монитор дороже");
                break;
            case -1: System.out.println("Этот монитор дешевле");
        }

        System.out.println("\n");

        switch (size.compare(matrix, tube)){
            case 0: System.out.println("Этот монитор больше");
                break;
            case 1: System.out.println("Этот монитор меньше");
                break;
        }

        System.out.println("\n");

        switch (quality.compare(matrix, tube)){
            case 0: System.out.println("Качество изображения этого монитора лучше");
                break;
            case 1: System.out.println("Качество изображения этого монитора хуже");
                break;
        }
    }
}

