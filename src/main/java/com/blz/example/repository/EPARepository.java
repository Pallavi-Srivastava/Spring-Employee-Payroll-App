package com.blz.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.blz.example.model.EPAData;

public interface EPARepository extends JpaRepository<EPAData, Integer> {

	@Query(value = "select * from employee_payroll, employee_department where employee_id = id and department =:department", nativeQuery = true)
	List<EPAData> findEmployeesById(String department);

}
