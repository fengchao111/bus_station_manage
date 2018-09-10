package com.fc.dao;

import com.fc.domian.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("EmployeeDAO")
public interface EmployeeDAO {
    public Employee selectEmployeeByEmp_id(int emp_id);
    public List<Employee> selectEmployee();
}
