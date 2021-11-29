package com.codeclan.example.employeeTrackingApplication.controllers;

import com.codeclan.example.employeeTrackingApplication.models.Employee;
import com.codeclan.example.employeeTrackingApplication.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    // ask spring to inject an instance of employeeRepository
    @Autowired
    EmployeeRepository employeeRepository;

    // map a route to a method
    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    // map a route for a method to get employee by id
    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

}
