package com.dasha_labs.laba1.laba2;

public class TubeMonitor implements Comparable{

    private static int price = 500;

    public String toString(){
        return "Tube Monitor";
    }

    public int size(){
        System.out.println("Небольшой");
        return 0;
    }

    public void form(){
        System.out.println("Объемный и квадратный");
    }

    public int quality(){
        System.out.println("Не самое лучшее");
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
