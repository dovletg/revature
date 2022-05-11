package com.dovlet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    Connection connection;

    public EmployeeDaoImpl(){
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        String sql = "insert into employee (name, email) values (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Employee saved");
        else
            System.out.println("Oops! something went wrong");
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(int id) {

    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        String sql = "select * from employee";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            Employee employee = new Employee(id, name, email);
            employees.add(employee);
        }
        return employees;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }
}
