package com.dasha_labs.laba1.laba4;

import java.util.Scanner;

public class WhatWeDo {
    WhatWeDo() throws ClassNotFoundException {
        while (true){

            System.out.println("\n");
            System.out.println("Нажмите 1, что бы увидеть список мониторов");
            System.out.println("Нажмите 2, что добавить монитор");
            System.out.println("Нажмите 3, что бы найти монитор по названию");
            System.out.println("Нажмите 4, что бы удалить монитор по названию");
            System.out.println("Нажмите 5, что бы очистить таблицы");
            System.out.println("Нажмите 6, что бы изменить размер монитора");
            System.out.println("Нажмите 0, что бы завершить работу");

            Scanner scanner = new Scanner(System.in);
            int process = scanner.nextInt();
            MonitorsActor actor = new MonitorsActor();

            switch (process){
                case 1: actor.showAllMonitors();
                    break;
                case 2:
                    String kostil = scanner.nextLine();
                    System.out.println("Введите тип монитора:");
                    String type = scanner.nextLine();
                    System.out.println("Введите название монитора:");
                    String name = scanner.nextLine();
                    System.out.println("Введите качество монитора:");
                    String quality = scanner.nextLine();
                    System.out.println("Введите размер монитора:");
                    int size = scanner.nextInt();
                    actor.addMonitor(type, name, quality, size);
                    break;
                case 3 :
                    String kostil2 = scanner.nextLine();
                    System.out.println("Ведите название монитора, который вы ищите");
                    String findName = scanner.nextLine();
                    actor.findByName(findName);
                    break;
                case 4:
                    String kostil3 = scanner.nextLine();
                    System.out.println("Введите название монитора, который хотите удалить");
                    String deleteName = scanner.nextLine();
                    actor.deleteByName(deleteName);
                    break;
                case 5: actor.deleteAllBD();
                    break;
                case 6:
                    String kostil4 = scanner.nextLine();
                    System.out.println("Введите название монитора");
                    String nameChange = scanner.nextLine();
                    System.out.println("Введите новый размер диагонали монитора");
                    int newSize = scanner.nextInt();
                    actor.replaceSizebyName(nameChange, newSize);
                    break;
                case 0: System.exit(0);
            }
        }
    }
}
