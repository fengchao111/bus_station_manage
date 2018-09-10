package com.fc.service;

import com.fc.domian.Employee;

import java.util.List;


public interface EmployeeService {

    public Employee selectEmployeeByEmp_id(int emp_id);

    public List<Employee> selectEmployee();

}
