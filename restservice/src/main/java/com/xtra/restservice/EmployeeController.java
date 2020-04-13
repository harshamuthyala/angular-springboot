package com.xtra.restservice;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xtra.restservice.domain.Employee;
import com.xtra.restservice.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		
		return employeeService.getEmployees();
		
	}
	@GetMapping("/getEmployee")
	public Optional<Employee> getEmployeeByFirstName(String name){
		
		return employeeService.getEmployeeByName(name);
		
	}

}
