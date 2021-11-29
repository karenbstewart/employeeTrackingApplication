package com.codeclan.example.employeeTrackingApplication.repositories;

import com.codeclan.example.employeeTrackingApplication.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
