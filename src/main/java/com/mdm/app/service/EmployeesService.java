package com.mdm.app.service;


import com.mdm.app.entity.Employees;
import com.mdm.app.exception.MDMExceptionImpl;

import java.util.ArrayList;

public interface EmployeesService {

    public ArrayList<Employees> getAllEmployees() throws MDMExceptionImpl;
}
