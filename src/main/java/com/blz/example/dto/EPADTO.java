package com.blz.example.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class EPADTO {

	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Invalid Employee Name")
	@NotEmpty(message="Employee name cannot be null ")
	public String name;
	
	@Min(value = 5000, message="Min wage should be more than 500 ")
	public long salary;

	public EPADTO(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollDTO [name=" + name + ", salary=" + salary + "]";
	}
}
