package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.customexception.IdNotFoundException;
import com.employee.customexception.SalaryNotValidException;
import com.employee.doa.EmployeeDoa;
import com.employee.entity.EmployeeEntity;
@Service

public class EmployeeService {
	@Autowired
	EmployeeDoa ed;

	public String setAllValues(List<EmployeeEntity> b) {
		
		return ed.setAllValues(b);
	}

	public String setSalary(List<EmployeeEntity> y) throws SalaryNotValidException {
		List<EmployeeEntity> ab = y.stream().filter(a->a.getSalary()>50000).toList();
		if(ab.isEmpty()) {
		return ed.setSalary(y);
			 
	}
		else {
		throw new SalaryNotValidException("no value ");
		
			
		
		}
			
		}

	
	public EmployeeEntity getValueById(int y) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return ed.getValueById(y);
	} 
}
