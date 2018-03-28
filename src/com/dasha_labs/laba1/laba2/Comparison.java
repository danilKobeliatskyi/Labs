package com.dasha_labs.laba1.laba2;

public class Comparison {
    private MonitorSize size = new MonitorSize();
    private MonitorQuality quality = new MonitorQuality();

    private Selection selection = new Selection();
    private TubeMonitor o1 = selection.selectionsFirst();
    private TubeMonitor o2 = selection.selectionsSecond();

    public void comparisonSize(){
        switch (size.compare(o1, o2)){
            case 0: System.out.println(o1 + " больше");
                break;
            case 1: System.out.println(o1 + " меньше");
                break;
        }
    }

    public void comparisonQuantity(){
        switch (quality.compare(o1, o2)){
            case 0: System.out.println(o1 + " больше");
                break;
            case 1: System.out.println(o1 + " меньше");
                break;
        }
    }

    public void comparisonPrise(){

        switch (o1.compareTo(o2)){
            case 0: System.out.println("Цена " + o1 + " и " + o2 + " одинакова");
                break;
            case 1: System.out.println(o1 + " дороже чем " + o2);
                break;
            case -1: System.out.println(o1 + " дешевле чем " + o2);
        }
    }
}
