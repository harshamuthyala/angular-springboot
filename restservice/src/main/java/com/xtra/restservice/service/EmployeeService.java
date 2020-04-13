package com.xtra.restservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xtra.restservice.domain.Employee;
import com.xtra.restservice.repository.EmployeeRepository;

@Service
public class EmployeeService  {
	
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	public List<Employee> getEmployees() {
		
		return employeeRepo.findAll();
		
	}
	
public Optional<Employee> getEmployeeByName(String firstName) {
		
		return employeeRepo.findByFirstName(firstName);
		
	}
	

}
