package com.mdm.app.service;

import com.mdm.app.dao.EmployeesDaoImpl;
import com.mdm.app.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    EmployeesDaoImpl employeesDao;

    @GetMapping
    public ArrayList<Employees> getAllEmployees() {
        //		find all employees data, then return it
        ArrayList<Employees> emps = (ArrayList<Employees>) employeesDao.findAll();
        return emps;
    }
}
