package com.mdm.app.dao;

import com.mdm.app.entity.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesDaoImpl extends CrudRepository<Employees, Integer> {

}
