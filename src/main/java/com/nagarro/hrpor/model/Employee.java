package com.nagarro.hrpor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private long employeecode;
    
    @Column(name = "employeename")
    private String employeename;


    @Column(name = "location")
    private String location;

    @Column(name = "email")
    private String email;
    
    @Column(name = "dateofbirth")
    private String dateofbirth;
	@Column(name= "username" )
    private String username;
    
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

    public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public long getEmployeeCode() {
        return employeecode;
    }
    public void setEmployeeCode(long employeecode) {
        this.employeecode = employeecode;
    }
    @Override
	public String toString() {
		return "Employee [employeecode=" + employeecode + ", employeename=" + employeename + ", location=" + location
				+ ", email=" + email + ", dateofbirth=" + dateofbirth + ", username=" + username+"]";
	}
	public String getEmployeeName() {
        return employeename;
    }
    public void setEmployeeName(String employeename) {
        this.employeename = employeename;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}