package com.mdm.app.controller;

import com.mdm.app.entity.Employees;
import com.mdm.app.service.EmployeesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeesServiceImpl employeesService;

    @GetMapping(value = "/getEmp", produces = "application/json")
    public List<Employees> getEmployees() {
        return employeesService.getAllEmployees();
    }

}
