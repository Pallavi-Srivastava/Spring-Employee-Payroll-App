package com.blz.example.service;

import java.util.List;
import com.blz.example.dto.EPADTO;
import com.blz.example.model.EPAData;

public interface IEPAService {

	List<EPAData> getEPAData();

	EPAData getEPADataById(int empId);

	List<EPAData> getEmployeesByDepartment(String department);

	EPAData createEPAData(EPADTO EPADTO);

	EPAData updateEPAData(int empId, EPADTO employeePayrollDTO);

	void deleteEPAData(int empId);
}
