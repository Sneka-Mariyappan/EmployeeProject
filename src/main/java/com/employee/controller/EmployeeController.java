package com.employee.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.customexception.SalaryNotValidException;
import com.employee.entity.EmployeeEntity;
import com.employee.service.EmployeeService;
import com.product.controller.ProductController;


@RestController

public class EmployeeController {
	@Autowired
	EmployeeService es;
	static Logger log = Logger.getLogger(EmployeeController.class);
	

	@PostMapping(path="/set1")
	public String setAllValues(@RequestBody List<EmployeeEntity> b) {
		return es.setAllValues(b);
	

}
	
	@PostMapping(path="/set2")
	public String setSalary(@RequestBody List<EmployeeEntity> x) throws SalaryNotValidException {
	return es.setSalary(x);
	
}
	
//	@GetMapping(path="/set3/{y}")
//	public EmployeeEntity getValueById(@PathVariable String y) {
//		PropertyConfigurator.configure("log4j.properties");
//		log.info(y);
//		return es.getValueById(y);
		//}
}