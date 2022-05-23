package com.dovlet;

// Sixth step

public class BankingDaoFactory {
    public static BankingDao dao;

    private BankingDaoFactory(){}

    public static BankingDao getBankingDao(){
        if(dao==null)
            dao = new BankingDaoImpl();
        return dao;
    }
}
