package com.learn.springboot.springbootdemo.service;

import com.learn.springboot.springbootdemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmpoyee(Employee employee);

    List<Employee> getAllEmployees();

    Employee geEmployeeById(Long id);

}
