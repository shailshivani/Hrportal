package com.nagarro.hrpor.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.hrpor.model.Employee;
import com.nagarro.hrpor.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    
    public List < Employee > getEmployees(String username) {
        return employeeRepository.findemployeebyUsername(username);
    }
    public Employee getEmployeeByEmployeeCode(long employeecode) {
        Optional < Employee > optional = employeeRepository.findById(employeecode);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            return employee;
        }
        return employee;
    }
    
   
    public void deleteEmployeeByEmployeeCode(long employeecode) {
    	employeeRepository.deleteById(employeecode);
    }
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
        
    }
}