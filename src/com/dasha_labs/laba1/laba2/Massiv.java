package com.dasha_labs.laba1.laba2;

import java.util.*;

public class Massiv {
    private Scanner scanner = new Scanner(System.in);
    List<TubeMonitor> list = new ArrayList<>();


    public List<TubeMonitor> arrayFilling(){
        System.out.println("Введите размер масива");
        int size = scanner.nextInt();
        TubeMonitor[] monitors = new TubeMonitor[size];

        Random random = new Random();
        for (int i = 0; i < monitors.length; i++) {
            int type = random.nextInt(3);
            switch (type){
                case 0: monitors[i] = new TubeMonitor();
                break;
                case 1: monitors[i] = new LedMonitor();
                break;
                case 2: monitors[i] = new MatrixMonitor();
                break;
            }
            System.out.println(monitors[i]);
            list.add(monitors[i]);
        }
        Collections.sort(list);
        System.out.println();
        System.out.println("Отсортированый масив: ");
        System.out.println(list);
        return list;
    }
}
