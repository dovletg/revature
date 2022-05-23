package com.dovlet;

// Second step

import java.sql.SQLException;
import java.util.List;

public interface BankingDao {

    // possible methods I want to implement. obj
    void addBanking(Banking user) throws SQLException;
    Banking viewBanking(Banking balance) throws SQLException;
    void depositBanking(Banking balance) throws SQLException;
    void withdrawBanking(Banking balance);
    void deleteBanking(int id);

    // list of bankers
    List<Banking> getBanking() throws SQLException;
    Banking getBankingById(int id);

    int getBalanceById(int id) throws SQLException;

    void updateBanking(Banking banking);
}
