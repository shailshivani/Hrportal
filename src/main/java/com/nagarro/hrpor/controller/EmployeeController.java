package com.nagarro.hrpor.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.hrpor.model.Employee;
import com.nagarro.hrpor.service.EmployeeService;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/findEmployee/{username}")
    @ResponseBody
    public List<Employee> findEmployee(@PathVariable("username") String username) {
        List<Employee> emp= employeeService.getEmployees(username);
        return emp;
    }
    
    
    @GetMapping("/findEmployeeByEmployeeCode/{employeecode}")
    @ResponseBody
    public Employee findEmployeeByEmployeeCode(@PathVariable("employeecode") long employeecode) {
        Employee emp= employeeService.getEmployeeByEmployeeCode(employeecode);
        return emp;
    }
    
    @GetMapping("/deleteEmployeeByEmployeeCode/{employeecode}")
    @ResponseBody
    public void deleteEmployeeByEmployeeCode(@PathVariable("employeecode") long employeecode) {
        employeeService.deleteEmployeeByEmployeeCode(employeecode);
        return;
        
    }
    
    
    @PostMapping("/saveEmployee")
    @ResponseBody
    public void saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return;
    }
	
}