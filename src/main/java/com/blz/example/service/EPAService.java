package com.blz.example.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.blz.example.dto.EPADTO;
import com.blz.example.model.EPAData;

@Service
public class EPAService implements IEPAService {

	@Override
	public List<EPAData> getEPAData() {
		List<EPAData> payrollDatas = new ArrayList<>();
		payrollDatas.add(new EPAData(1, new EPADTO("Pallavi", 800000)));
		return payrollDatas;
	}

	@Override
	public EPAData getEPADataById(int empId) {
		EPAData payrollDatas = null;
		payrollDatas = new EPAData(2, new EPADTO("Anika", 400000));
		return payrollDatas;
	}

	@Override
	public EPAData createEPAData(EPADTO EPADTO) {
		EPAData payrollData = null;
		payrollData = new EPAData(3, EPADTO);
		return payrollData;
	}

	@Override
	public EPAData updateEPAData(EPADTO EPADTO) {
		EPAData payrollData = null;
		payrollData = new EPAData(3, EPADTO);
		return payrollData;
	}

	@Override
	public void deleteEPAData(int empId) {
		// TODO Auto-generated method stub
	}
}
