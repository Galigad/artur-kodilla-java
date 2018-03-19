package com.kodilla.hibernate.manytomany.dao;


import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDaoTestSuite {
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testNamedQuery() {
        //Given

        Employee e1 = new Employee("Artur", "Szuberla");
        Employee e2 = new Employee("Ewa", "Krynska");
        Employee e3 = new Employee("Will", "Smith");
        employeeDao.save(e1);
        employeeDao.save(e2);
        employeeDao.save(e3);
        //When
        List<Employee> result = employeeDao.retrieveEmployeeWithLastName("Szuberla");
        //Then
        Assert.assertEquals(1,result.size());
        //CleanUp
        employeeDao.deleteAll();
    }
}
