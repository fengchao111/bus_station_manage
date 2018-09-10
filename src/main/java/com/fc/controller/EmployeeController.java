package com.fc.controller;

import com.fc.domian.Employee;
import com.fc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller("EmployeeController")
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/showEmployee")
    public ModelAndView showEmployeePage(HttpServletRequest request){
//        String id = request.getParameter("id");
//        int emp_id = Integer.parseInt(id);
        System.out.println("fcfcfcf");
        Employee employee = employeeService.selectEmployeeByEmp_id(1);
        request.setAttribute("employee", employee);
        return new ModelAndView("/manager/rsxz/EmployeeDetail");
    }

    @RequestMapping("/showEmployees")
    public  ModelAndView showEmployees(HttpServletRequest request){
//        String id = request.getParameter("id");
//        int emp_id = Integer.parseInt(id);
        System.out.println("fcfcfcf");
        Employee employee = employeeService.selectEmployeeByEmp_id(13);
        request.setAttribute("employee", employee);
        return new ModelAndView("/show");
    }
}
