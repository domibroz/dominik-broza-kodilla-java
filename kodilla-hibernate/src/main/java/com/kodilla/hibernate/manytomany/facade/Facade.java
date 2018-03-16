package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Facade {
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> searchCompany(String name) {
        if (companyDao.retrieveCompanyName(name).size() == 0) {
            LOGGER.info(SearchingException.ERR_COMPANY_NOT_FOUND_ERROR);
        }
        return companyDao.retrieveCompanyName(name);
    }

    public List<Employee> searchEmployee(String name) {
        if (employeeDao.retrieveEmployeeName(name).size() == 0) {
            LOGGER.info(SearchingException.ERR_EMPLOYEE_NOT_FOUND_ERROR);
        }
        return employeeDao.retrieveEmployeeName(name);
    }


}
