
package week03classicmodels.persistence;



import week03classicmodels.business.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<week03classicmodels.business.Employee> getAllEmployees();
    public Employee getById(int id);
}
