package com.dasha_labs.laba1.laba4;

import com.dasha_labs.laba1.laba4.dao.DAOFactory;
import com.dasha_labs.laba1.laba4.dao.IMyDao;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class MonitorsActor {

    private TablePrise tablePrise = new TablePrise();
    private TableCountry tableCountry = new TableCountry();
    private Connection connection = null;
    private List<Monitors> data;
    private IMyDao bdManager;
    private Statement statement;

    public MonitorsActor() throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        bdManager = DAOFactory.getDao();
        data = bdManager.getAllData();
    }

    public void showAllMonitors(){
        for (Monitors monitors : data){
            printMonitor(monitors);
        }
    }

    public void addMonitor(String type, String name, String quality, int size) {
        try {
            bdConnection();
            statement.executeUpdate("INSERT INTO typemonitor VALUES(null, '" + type + "', '" + name + "', '" + quality + "', " + size + ")");
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    tablePrise.addPrise(generatedKeys.getLong(1));
                    tableCountry.addCountry(generatedKeys.getLong(1));
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void findByName(String name){
        try {
            bdConnection();
            ResultSet rs = statement.executeQuery("SELECT typemonitor.*, monitorprice.price, countries.country FROM ((typemonitor INNER JOIN monitorprice ON typemonitor.id = monitorprice.typemonitor_id) INNER JOIN countries ON typemonitor.id = countries.typemonitor_id) WHERE typemonitor.name = '" + name + "'");
            Price price = new Price(rs.getInt("price"));
            Country country = new Country(rs.getString("country"));
            Monitors monitors = new Monitors(rs.getString("type"), rs.getString("name"), rs.getString("quality"), rs.getInt("size"), price, country);
            printMonitor(monitors);
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteById(int id){
        try {
            bdConnection();
            statement.execute("DELETE FROM typemonitor WHERE id = " + id);
            tablePrise.deleteById(id);
            tableCountry.deleteById(id);
            connection.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteByName(String name) {
        try {
            bdConnection();
            statement.execute("DELETE FROM typemonitor WHERE name = '" + name + "'");
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        tablePrise.deleteById(generatedKeys.getLong(1));
                        tableCountry.deleteById(generatedKeys.getLong(1));
                    } else {
                        throw new SQLException("Creating user failed, no ID obtained.");
                    }
                }
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
        }
    }

    public void deleteAllBD(){
        try {
            bdConnection();
            statement.execute("DELETE FROM typemonitor WHERE EXISTS ( SELECT * FROM typemonitor);");
            connection.close();
            tablePrise.deleteAllBD();
            tableCountry.deleteAllBD();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void replaceSizebyName(String name, int size){
        Scanner scanner = new Scanner(System.in);
        try {
            bdConnection();
            statement.execute("UPDATE typemonitor SET size = " + size + " WHERE name = '" + name + "'");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    private void printMonitor(Monitors monitor){
        System.out.println("Type: " + monitor.getType() + " Name: " + monitor.getName() + " Quality: " + monitor.getQuality() + " Size: " + monitor.getSize() + " Price: " + monitor.getPrice() + " Country: " + monitor.getCountry());
    }
}
