package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryFascadeTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    QueryFascade queryFascade;

    @Test
    public void retriveCompaniesWithNameLike() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Company> result = queryFascade.retrieveCompaniesWithNameLike("%ma%");

        //Then
        Assert.assertEquals(3, result.size());

        //CleanUp
        companyDao.deleteAll();
    }
    @Test
    public void retriveEmployeeSurname(){
        Employee e1 = new Employee("Artur", "Szuberla");
        Employee e2 = new Employee("Ewa", "Krynska");
        Employee e3 = new Employee("Will", "Smith");

        employeeDao.save(e1);
        employeeDao.save(e2);
        employeeDao.save(e3);

        List<Employee> result = queryFascade.retriveEmployeeSurname("%s%");

        Assert.assertEquals(3,result.size());

        employeeDao.deleteAll();
    }

    @Test
    public void retriveEmployee() {
    }
}