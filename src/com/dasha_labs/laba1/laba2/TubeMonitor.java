package com.dasha_labs.laba1.laba2;

public class TubeMonitor implements Monitor, Comparable{

    public String name = "Tube";
    private static int price = 500;

    public String toString(){
        return "[Tube Monitor]";
    }

    public int size(){
        System.out.println("Диагональ лампового монитора 10 дюймов");
        return 0;
    }

    public void form(){
        System.out.println("Объемный и квадратный");
    }

    public int quality(){
        System.out.println("Качество изображения лампового монитора 800х600");
        return 0;
    }

    public int getPrice(){
        return TubeMonitor.price;
    }

    @Override
    public int compareTo(Object o) {
        int otherPrice = ((TubeMonitor)o).getPrice();
        if (price == otherPrice)
            return 0;
        else
            return (price > otherPrice) ? 1 : -1;
    }
}
