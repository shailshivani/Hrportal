package com.nagarro.hrpor.service;


import java.util.List;

import com.nagarro.hrpor.model.Employee;

public interface EmployeeService {
    List < Employee > getEmployees(String username);
	Employee getEmployeeByEmployeeCode(long employeecode);

	void deleteEmployeeByEmployeeCode(long employeecode);

	void saveEmployee(Employee employee);
}