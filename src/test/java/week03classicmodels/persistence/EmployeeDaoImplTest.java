package week03classicmodels.persistence;

import week03classicmodels.business.Employee;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDaoImplTest {

    @org.junit.jupiter.api.Test
    void getAllEmployees() {
        EmployeeDao empDao = new EmployeeDaoImpl();
        List<Employee> result = empDao.getAllEmployees();
        Employee e1 = new Employee(1625, "Kato", "Yoshimi", "x102", "ykato@classicmodelcars.com", "5", 1621,
                "Sales Rep");
        Employee e2 = new Employee(1625, "Kato", "Yoshimi", "x102", "ykato@classicmodelcars.com", "5", 1621,
                "Sales Rep");
        Employee e3 = new Employee(1625, "Kato", "Yoshimi", "x102", "ykato@classicmodelcars.com", "5", 1621,
                "Sales Rep");
        List<Employee> expected = new ArrayList<>();

        expected.add(e1);
        expected.add(e2);
        expected.add(e3);

        for (int i = 0; i < 3; i++) {
            assertEmployeeEquals(expected.get(i), result.get(i));
        }
    }

    @org.junit.jupiter.api.Test
    void getById_NoMatchFound() {
        EmployeeDao empDao = new EmployeeDaoImpl();
        Employee result = empDao.getById(1);
        assertNull(result);
    }

    /*@org.junit.jupiter.api.Test
    void getById_MatchFound() {
        EmployeeDao empDao = new EmployeeDaoImpl();
        Employee expected = new Employee(1625, "Kato", "Yoshimi", "x102", "ykato@classicmodelcars.com", "5", 1621,
                "Sales Rep");
        Employee result = empDao.getById(1625);
        assertEmployeeEquals(expected, result);
    }*/

    void assertEmployeeEquals(Employee expected, Employee result){
        assertEquals(expected.getEmployeeNumber(), result.getEmployeeNumber());
        assertEquals(expected.getLastName(), result.getLastName());
        assertEquals(expected.getFirstName(), result.getFirstName());
        assertEquals(expected.getEmail(), result.getEmail());
        assertEquals(expected.getExtension(), result.getExtension());
        assertEquals(expected.getJobTitle(), result.getJobTitle());
        assertEquals(expected.getReportsTo(), result.getReportsTo());
        assertEquals(expected.getOfficeCode(), result.getOfficeCode());
    }
}