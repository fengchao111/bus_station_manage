package com.fc.serviceImpl;

import com.fc.dao.EmployeeDAO;
import com.fc.domian.Employee;
import com.fc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;



    @Override
    public Employee selectEmployeeByEmp_id(int emp_id) {

        Employee employee = null;
        employee = employeeDAO.selectEmployeeByEmp_id(emp_id);
        return employee;
    }


    @Override
    public List<Employee> selectEmployee() {

        List<Employee> list = null;
        list = employeeDAO.selectEmployee();
        return list;
    }

}
