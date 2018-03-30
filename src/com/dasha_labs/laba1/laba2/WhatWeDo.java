package com.dasha_labs.laba1.laba2;

import java.util.Scanner;

public class WhatWeDo {
    WhatWeDo(){
        while (true){

            System.out.println("\n");
            System.out.println("Нажмите 1, что бы увидеть список мониторов");
            System.out.println("Нажмите 2, что бы прочитать описание монитора");
            System.out.println("Нажмите 3, что бы создать масив мониторов");
            System.out.println("Нажмите 4, что бы сравнить 2 монитора по цене");
            System.out.println("Нажмите 5, что бы сравнить 2 монитора по размеру");
            System.out.println("Нажмите 6, что бы сравнить 2 монитора по качеству изображения");
            System.out.println("Нажмите 0, что бы завершить работу");

            Comparison comparison = new Comparison();
            Scanner scanner = new Scanner(System.in);
            int process = scanner.nextInt();

            switch (process){
                case 1:
                    SetOfMonitors set = new SetOfMonitors();
                    set.setFilling();
                    break;
                case 2:
                    Description description = new Description();
                    Selection selection = new Selection();
                    TubeMonitor o1 = selection.selectionsFirst();
                    description.description(o1);
                break;
                case 3:
                    Massiv massiv = new Massiv();
                    massiv.arrayFilling();
                break;
                case 4: comparison.comparisonPrise();
                break;
                case 5: comparison.comparisonSize();
                break;
                case 6: comparison.comparisonQuantity();
                break;
                case 0: System.exit(0);
            }
        }
    }
}
