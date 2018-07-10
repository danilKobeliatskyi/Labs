package com.dasha_labs.laba1.laba4.dao;

public class DAOFactory {
    public static IMyDao getDao() throws ClassNotFoundException {
        return new MySQLDAO();
    }
}
