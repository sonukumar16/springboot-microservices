package com.innovate.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovate.department.entity.Department;
import com.innovate.department.respository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class DepartmentService {

	@Autowired 
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		 log.info("Inside saveDepartment method of DepartmentService ");	
		return departmentRepository.save(department);
		
	}
	
	public Department getDepartmentById(Long departmentId) {
		log.info("Inside getDepartmentById method of DepartmentService ");	
		return departmentRepository.findByDepartmentId(departmentId);
		
	}
	
	
	
}
