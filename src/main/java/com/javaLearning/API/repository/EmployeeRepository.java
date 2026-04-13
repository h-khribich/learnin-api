package com.javaLearning.API.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaLearning.API.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
  
}
