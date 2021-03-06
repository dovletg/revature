package com.dovlet;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    void addEmployee(Employee employee) throws SQLException;
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
    List<Employee> getEmployees() throws SQLException;
    abstract Employee getEmployeeById(int id);
}
