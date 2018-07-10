package com.dasha_labs.laba1.laba2;

public class MatrixMonitor extends LedMonitor implements Monitor, Comparable{

    private static int price = 5500;
    private String name = "Matrix";

    public String toString(){
        return "[Matrix Monitor]";
    }

    public int size(){
        System.out.println("Диагональ матричного монитора 20 дюймов");
        return 2;
    }

    public void form(){
        System.out.println("Плоский и прямоугольный");
    }

    public int quality(){
        System.out.println("Качество изображения матричного монитора 1920х1080");
        return 2;
    }

    public int getPrice(){
        return MatrixMonitor.price;
    }

    @Override
    public int compareTo(Object o) {
        int otherPrice = ((TubeMonitor) o).getPrice();
        if (price == otherPrice)
            return 0;
        else
            return (price > otherPrice) ? 1 : -1;
    }
}
