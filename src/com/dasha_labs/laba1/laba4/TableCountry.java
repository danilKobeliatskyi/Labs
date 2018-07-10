package com.dasha_labs.laba1.laba4;

import com.dasha_labs.laba1.laba4.dao.DAOFactory;
import com.dasha_labs.laba1.laba4.dao.IMyDao;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class TableCountry {
    private Connection connection = null;
    private List<Country> data;
    private IMyDao bdManager;
    private Statement statement;

    public TableCountry() throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        bdManager = DAOFactory.getDao();
        data = bdManager.getAllDataCountry();
    }

    public void showAllMonitors(){
        for (Country country : data){
            System.out.println(" country: " + country.getCountry());
        }
    }

    public void addCountry(long id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну производитель:");
        String country = scanner.nextLine();
        try {
            bdConnection();
            statement.executeUpdate("INSERT INTO countries VALUES(null, '" + country + "', " + id + ")");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(long id){
        try {
            bdConnection();
            statement.execute("DELETE FROM countries WHERE typemonitor_id = " + id);
            connection.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAllBD(){
        try {
            bdConnection();
            statement.execute("DELETE FROM countries WHERE EXISTS ( SELECT * FROM countries);");
            connection.close();
        }catch (SQLException e){
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
}
