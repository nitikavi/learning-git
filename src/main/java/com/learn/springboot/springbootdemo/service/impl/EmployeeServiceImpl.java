package com.learn.springboot.springbootdemo.service.impl;

import com.learn.springboot.springbootdemo.exception.ResourceNotFoundException;
import com.learn.springboot.springbootdemo.model.Employee;
import com.learn.springboot.springbootdemo.repository.EmployeeRepo;
import com.learn.springboot.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee saveEmpoyee(Employee employee) {
      return employeeRepo.save(employee);

    }

    @Override
    public List<Employee> getAllEmployees() {
       return employeeRepo.findAll();
    }

    @Override
    public Employee geEmployeeById(Long id){

        Optional<Employee> emp= employeeRepo.findById(id);
        if(emp.isPresent())
        {
            return emp.get();
        }else
        {
            throw new ResourceNotFoundException("Employee","Id",id);
        }



    }

}
