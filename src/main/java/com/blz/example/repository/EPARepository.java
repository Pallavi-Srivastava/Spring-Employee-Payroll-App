package com.blz.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blz.example.model.EPAData;

public interface EPARepository extends JpaRepository<EPAData, Integer> {

}
