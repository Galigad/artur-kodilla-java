package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryFascade {
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public QueryFascade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> retrieveCompaniesWithNameLike(String arg) {
        return companyDao.retrieveCompaniesWithNameLike("%" + arg + "%");
    }

    public List<Employee> retriveEmployeeSurname(String arg) {
        return employeeDao.retriveEmployeeSurname("%" + arg + "%");
    }
}
