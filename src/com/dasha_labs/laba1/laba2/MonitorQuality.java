package com.dasha_labs.laba1.laba2;

import java.util.Comparator;

public class MonitorQuality implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (((TubeMonitor) o1).quality() > ((TubeMonitor) o2).quality())
            return 0;
        else
            return 1;
    }
}
