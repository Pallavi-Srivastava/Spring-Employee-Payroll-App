package com.blz.example.dto;

public class EPADTO {

	public String name;
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
