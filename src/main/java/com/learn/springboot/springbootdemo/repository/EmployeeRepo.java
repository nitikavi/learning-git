package com.learn.springboot.springbootdemo.repository;

import com.learn.springboot.springbootdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
