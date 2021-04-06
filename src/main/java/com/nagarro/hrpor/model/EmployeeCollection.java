package com.nagarro.hrpor.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCollection {
	
	private List<Employee> allemployee;
	
	

	public List<Employee> getAllemployee() {
		return allemployee;
	}



	public void setAllemployee(List<Employee> allemployee) {
		this.allemployee = allemployee;
	}



	

}
