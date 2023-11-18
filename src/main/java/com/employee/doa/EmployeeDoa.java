package com.employee.doa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.customexception.IdNotFoundException;
import com.employee.entity.EmployeeEntity;
import com.employee.repository.EmployeeRepository;

@Repository

public class EmployeeDoa {
	@Autowired
	EmployeeRepository er;
	public String setAllValues(List<EmployeeEntity> b) {
		er.saveAll(b);
		
		return "saved" ;
	}
	public String setSalary(List<EmployeeEntity> y) {
		er.saveAll(y);
		return "saved" ;
	
	}
	public EmployeeEntity getValueById(int ab)  throws IdNotFoundException{
		
		return er.findById(ab).orElseThrow(()->new IdNotFoundException("not a valid id"));
	}
	
	


}
