package com.xtra.restservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xtra.restservice.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	public List<Department> findAll();
	
	public Optional<Department> findById(Long id);
	
	public Optional<Department> findByDeptName(String dept_name);
	

}
