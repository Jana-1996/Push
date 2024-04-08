package com.PrimaryQualifier.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PrimaryQualifier.Interface.Employee;

@RestController
public class EmployeeController {
	@Qualifier("Senior")
	@Autowired
	Employee emp;
	
	
	
	@GetMapping(value="/getEmp")
	public String getEmp() {
		return emp.getMsg();
	}
}
