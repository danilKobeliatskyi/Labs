package com.dasha_labs.laba1.laba4.dao;

import com.dasha_labs.laba1.laba4.Country;
import com.dasha_labs.laba1.laba4.Monitors;
import com.dasha_labs.laba1.laba4.Price;

import java.util.List;

public interface IMyDao {
    List<Monitors> getAllData();
    List<Price> getAllDataPrice();
    List<Country> getAllDataCountry();
    void addMonitor();
    void updateMonitors(List<Monitors> monitors);
    void clearAll();
}
