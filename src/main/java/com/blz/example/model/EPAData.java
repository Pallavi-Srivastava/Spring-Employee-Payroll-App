package com.blz.example.model;

import java.time.LocalDate;
import java.util.List;

import com.blz.example.dto.EPADTO;

import lombok.Data;

@Data
public class EPAData {

	private int employeeId;
	private String name;
	private long salary;

	private String gender;
	private LocalDate startDate;
	private String note;
	private String profilePic;
	private List<String> departments;

	public EPAData(int employeeId, EPADTO employeePayrollDTO) {
		super();
		this.employeeId = employeeId;
		this.updateEmployeePayrollData(employeePayrollDTO);
	}

	public void updateEmployeePayrollData(EPADTO employeePayrollDTO) {
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.gender = employeePayrollDTO.gender;
		this.startDate = employeePayrollDTO.startDate;
		this.note = employeePayrollDTO.note;
		this.profilePic = employeePayrollDTO.profilePic;
		this.departments = employeePayrollDTO.departments;
	}
}
