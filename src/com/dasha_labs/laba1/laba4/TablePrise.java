package com.dasha_labs.laba1.laba4;

import com.dasha_labs.laba1.laba4.dao.DAOFactory;
import com.dasha_labs.laba1.laba4.dao.IMyDao;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class TablePrise {

    private Connection connection = null;
    private List<Price> data;
    private IMyDao bdManager;
    private Statement statement;

    public TablePrise() throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        bdManager = DAOFactory.getDao();
        data = bdManager.getAllDataPrice();
    }

    public void showAllMonitors(){
        for (Price price : data){
            System.out.println(" price: " + price.getPrice());
        }
    }

    public void addPrise(long id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену монитора:");
        int price = scanner.nextInt();
        try {
            bdConnection();
            statement.executeUpdate("INSERT INTO monitorprice VALUES(null, " + price + ", " + id + ")");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(long id){
        try {
            bdConnection();
            statement.execute("DELETE FROM monitorprice WHERE typemonitor_id = " + id);
            connection.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAllBD(){
        try {
            bdConnection();
            statement.execute("DELETE FROM monitorprice WHERE EXISTS ( SELECT * FROM monitorprice);");
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
