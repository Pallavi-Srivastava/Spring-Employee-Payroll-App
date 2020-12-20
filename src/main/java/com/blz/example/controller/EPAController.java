package com.blz.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blz.example.dto.EPADTO;
import com.blz.example.dto.ResponseDTO;
import com.blz.example.model.EPAData;

@RestController
@RequestMapping("/employeepayrollservice")
public class EPAController {

	@RequestMapping(value = { "", "/", "get" })
	public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
		EPAData empData = null;
		empData = new EPAData(1, new EPADTO("Pallavi", 800000));
		ResponseDTO resDTO = new ResponseDTO("Get Call Success !!!", empData);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
		EPAData empData = null;
		empData = new EPAData(2, new EPADTO("Anika", 400000));
		ResponseDTO resDTO = new ResponseDTO("Get Call for id Successful:", empData);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EPADTO employeePayrollDTO) {
		EPAData empData = null;
		empData = new EPAData(3, employeePayrollDTO);
		ResponseDTO resDTO = new ResponseDTO("Created Employee Payroll Data Successfully:", empData);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EPADTO employeePayrollDTO) {
		EPAData empData = null;
		empData = new EPAData(3, employeePayrollDTO);
		ResponseDTO resDTO = new ResponseDTO("Updated Employee Payroll Data Successfully: ", empData);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
		ResponseDTO resDTO = new ResponseDTO("Deleted Successfully", "Deleted id: " + empId);
		return new ResponseEntity<ResponseDTO>(resDTO, HttpStatus.OK);
	}
}