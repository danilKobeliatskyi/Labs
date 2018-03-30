package com.dasha_labs.laba1.laba2;

import java.util.Scanner;

public class Selection {

    private TubeMonitor o1, o2;
    private Scanner scanner = new Scanner(System.in);

    public TubeMonitor selectionsFirst(){
        System.out.println("Ведите название монитора (tube, led или matrix)");
        String name1 = scanner.nextLine();

        switch (name1){
            case "tube" : o1 = new TubeMonitor();
                break;
            case "matrix" : o1 = new MatrixMonitor();
                break;
            case "led" : o1 = new LedMonitor();
                break;
        }
        return o1;
    }

    public TubeMonitor selectionsSecond() {
        System.out.println("Ведите название монитора, с которым вы хотите провести сравнение (tube, led или matrix)");
        String name2 = scanner.nextLine();

        switch (name2) {
            case "tube":
                o2 = new TubeMonitor();
                break;
            case "matrix":
                o2 = new MatrixMonitor();
                break;
            case "led":
                o2 = new LedMonitor();
                break;
        }
        return o2;
    }
}
