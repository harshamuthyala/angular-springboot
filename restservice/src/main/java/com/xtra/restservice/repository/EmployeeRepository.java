package com.xtra.restservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtra.restservice.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	public List<Employee> findAll();
		
	public Optional<Employee> findByFirstName(String firstName);
	
	

}
