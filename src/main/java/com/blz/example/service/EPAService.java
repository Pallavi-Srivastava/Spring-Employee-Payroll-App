package com.blz.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blz.example.dto.EPADTO;
import com.blz.example.exceptions.EmployeePayrollException;
import com.blz.example.model.EPAData;
import com.blz.example.repository.EPARepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EPAService implements IEPAService {

	@Autowired
	private EPARepository employeeRepository;

	@Override
	public List<EPAData> getEPAData() {
		return employeeRepository.findAll();
	}

	@Override
	public EPAData getEPADataById(int empId) {
		return employeeRepository.findById(empId).orElseThrow(
				() -> new EmployeePayrollException("Employee with employee id: " + empId + " does not exists."));
	}

	@Override
	public EPAData createEPAData(EPADTO ePADTO) {
		EPAData empData = null;
		empData = new EPAData(ePADTO);
		log.debug("Employee Data: " + empData.toString());
		return employeeRepository.save(empData);
	}

	@Override
	public EPAData updateEPAData(int empId, EPADTO employeePayrollDTO) {
		EPAData empData = this.getEPADataById(empId);
		empData.updateEmployeePayrollData(employeePayrollDTO);
		return employeeRepository.save(empData);
	}

	@Override
	public void deleteEPAData(int empId) {
		EPAData employeeDataById = this.getEPADataById(empId);
		employeeRepository.delete(employeeDataById);
	}
}
