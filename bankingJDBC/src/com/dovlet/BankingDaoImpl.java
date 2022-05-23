package com.dovlet;

// Third step is class that implements intarfaceDao



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankingDaoImpl implements BankingDao{

    // connection class obj
    Connection connection;

    //creating constructor
    public BankingDaoImpl(){
        this.connection = ConnectionFactory.getConnection();
    }


    // body for implementers
    @Override
    public void addBanking(Banking user) throws SQLException { // insert values into table
        String sql = "insert into banking (name, balance) values (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql); //throws sql exception
        preparedStatement.setString(1, user.getName());
        preparedStatement.setInt(2, user.getBalance());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Banking saved");
        else
            System.out.println("Oops! Something went wrong");
    }

    @Override //view balance
    public Banking viewBanking(Banking balance) throws SQLException {
        String sql = "select * from banking where id=" + balance.getBalance();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        int amount = 0;
        while (resultSet.next()) {
            amount = resultSet.getInt(2);
        }
        return balance;
    }

    @Override
    public void depositBanking(Banking balance) throws SQLException {
        String sql = "update banking set balance = " + balance + " where id =" + balance.getId();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.executeUpdate();
    }

    @Override
    public void withdrawBanking(Banking balance) {
        String sql = "update banking set balance = ? where id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, balance.getBalance());
            preparedStatement.setInt(2, balance.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBanking(int id) {

    }


    @Override  //get all
    public List<Banking> getBanking() throws SQLException {
        List<Banking> users = new ArrayList<>();
        String sql = "select * from banking";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int balance = resultSet.getInt(3);
            Banking user = new Banking(id, name, balance);
            users.add(user);
        }
        return users;
    }

    @Override
    public Banking getBankingById(int id) {

        return null;
    }

    @Override // case 2
    public int getBalanceById(int id) throws SQLException{
        int amount = 0;
        String sql = "select balance from banking where id=" + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            amount = resultSet.getInt(1);
        }
        return amount;
    }

    @Override  //deposit
    public void updateBanking(Banking banking) {
    String sql = "update banking set balance = ? where id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, banking.getBalance());
            preparedStatement.setInt(2, banking.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}