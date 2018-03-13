package com.dasha_labs.laba1.laba1;

import java.util.Scanner;

public class ValueXAndY {
    private double x;
    private double y;
    ValueXAndY(double a, double b) {

        //Рассчет х
        if (b <= 0) {
            System.out.println("b <= 0");
            System.out.println("Пожалуйста, введите число с: ");
            Scanner input = new Scanner(System.in);
            int c = input.nextInt();
            x = a + a - (3.5 * c + Math.sqrt(Math.abs(b)));
            System.out.println("x = " + x);
        } else

            if (b > 0.5) {
            System.out.println("b > 0.5");
            x = Math.tan(b) + a / b;
            System.out.println("x = " + x);
        } else {

            System.out.println("0 < b <= 0.5");
            x = 3.5 * a * b;
            System.out.println("x = " + x);
        }

        //Рассчет у
        if (a != 0 & a !=3.14){
            System.out.println("a не 0 и не пи");
            y = a/Math.log(Math.pow(Math.sin(a), 2));
            System.out.println("y = " + y);
        }else {
            System.out.println("a или 0 или пи");
            Math.cos(Math.pow(x, 2) + a);
            System.out.println("y = " + y);
        }
    }
}
