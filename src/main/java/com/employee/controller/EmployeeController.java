package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.customexception.IdNotFoundException;
import com.employee.customexception.SalaryNotValidException;

import com.employee.entity.EmployeeEntity;
import com.employee.service.EmployeeService;


@RestController

public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(path="/set1")
	public String setAllValues(@RequestBody List<EmployeeEntity> b) {
		return es.setAllValues(b);
	

}
	
	@PostMapping(path="/set2")
	public String setSalary(@RequestBody List<EmployeeEntity> x) throws SalaryNotValidException {
	return es.setSalary(x);
	
}
	
	@GetMapping(path="/set3/{y}")
	public EmployeeEntity getValueById(@PathVariable int y) throws IdNotFoundException{
		return es.getValueById(y);
	}
	
	
	
	
}