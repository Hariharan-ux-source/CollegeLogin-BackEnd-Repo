package com.example.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.Entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

}
