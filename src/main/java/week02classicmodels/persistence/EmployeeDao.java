package week02classicmodels.persistence;

import week02classicmodels.business.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployees();

}