package com.dasha_labs.laba1.laba4.dao;

import com.dasha_labs.laba1.laba4.Country;
import com.dasha_labs.laba1.laba4.Monitors;
import com.dasha_labs.laba1.laba4.Price;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLDAO implements IMyDao {

    private Statement statement;
    private Connection connection = null;

    public MySQLDAO() throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            bdConnection();
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    @Override
    public List<Monitors> getAllData() {
        List<Monitors> monitors = new ArrayList<>();
        try {
            bdConnection();
            ResultSet rs = statement.executeQuery("SELECT typemonitor.*, monitorprice.price, countries.country FROM ((typemonitor INNER JOIN monitorprice ON typemonitor.id = monitorprice.typemonitor_id) INNER JOIN countries ON typemonitor.id = countries.typemonitor_id)");
            while (rs.next()) {
                Price price = new Price(rs.getInt("price"));
                Country country = new Country(rs.getString("country"));
                Monitors monitor = new Monitors(rs.getString("type"), rs.getString("name"), rs.getString("quality"), rs.getInt("size"), price, country);
                monitors.add(monitor);
            }
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return monitors;
    }

    public List<Price> getAllDataPrice() {
        List<Price> prices = new ArrayList<>();
        try {
            bdConnection();
            ResultSet rs = statement.executeQuery("SELECT price FROM monitorprice");
            while (rs.next()) {
                // read the result set
                Price price = new Price(rs.getInt("price"));
                prices.add(price);
            }
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return prices;
    }

    @Override
    public List<Country> getAllDataCountry() {
        List<Country> countries = new ArrayList<>();
        try {
            bdConnection();
            ResultSet rs = statement.executeQuery("SELECT country FROM countries");
            while (rs.next()) {
                Country country = new Country(rs.getString("country"));
                countries.add(country);
            }
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return countries;
    }

    @Override
    public void addMonitor() {
        try {
            statement.executeUpdate("INSERT INTO typemonitor VALUES(null, 'TubeMonitor', 'Bad', 10)");
            statement.executeUpdate("INSERT INTO typemonitor VALUES(null, 'LedMonitor', 'Middle', 15)");
            statement.executeUpdate("INSERT INTO typemonitor VALUES(null, 'MatrixMonitor', 'Good', 20)");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateMonitors(List<Monitors> monitors) {

    }

    @Override
    public void clearAll() {

    }

    private void bdConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/Danil/IdeaProjects/Labs/monitors.db");
            statement = connection.createStatement();
            statement.setQueryTimeout(30); // set timeout to 30 sec.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
