package com.dasha_labs.laba1.laba2;

import java.util.Set;
import java.util.TreeSet;

public class SetOfMonitors {
    private TubeMonitor tube = new TubeMonitor();
    private LedMonitor led = new LedMonitor();
    private MatrixMonitor matrix = new MatrixMonitor();

    public void setFilling(){
        Set<String> monitorSet = new TreeSet<String>();
        monitorSet.add(tube.toString());
        monitorSet.add(led.toString());
        monitorSet.add(matrix.toString());
        System.out.println(monitorSet);
    }
}
