package com.blz.example.service;

import java.util.List;
import com.blz.example.dto.EPADTO;
import com.blz.example.model.EPAData;

public interface IEPAService {

	List<EPAData> getEPAData();

	EPAData getEPADataById(int empId);

	EPAData createEPAData(EPADTO EPADTO);

	EPAData updateEPAData(EPADTO EPADTO);

	void deleteEPAData(int empId);
}
