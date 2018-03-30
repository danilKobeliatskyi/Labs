package com.dasha_labs.laba1.laba2;

public class LedMonitor extends TubeMonitor implements Monitor, Comparable {

    private static int price = 1500;
    private String name = "Led";

    public String toString() {
        return "Led Monitor";
    }

    public int size() {
        System.out.println("Диагональ лэд монитора 15 дюймов");
        return 1;
    }

    public void form() {
        System.out.println("Почти плоский и квадратный");
    }

    public int quality() {
        System.out.println("Качество изображения лэд монитора 1280х720");
        return 1;
    }

    public int getPrice() {
        return LedMonitor.price;
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