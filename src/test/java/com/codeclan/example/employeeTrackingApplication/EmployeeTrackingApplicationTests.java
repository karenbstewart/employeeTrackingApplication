package com.codeclan.example.employeeTrackingApplication;

import com.codeclan.example.employeeTrackingApplication.models.Employee;
import com.codeclan.example.employeeTrackingApplication.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void createEmployee(){

		// an object of an employee
		Employee Jim = new Employee("Jim", 44, 13762, "jimtheastronaut@rocketmail.com");
		Employee Buzz = new Employee("Buzzlightyear", 25, 678302, "toinfinityandbeyond@blueyonder.com");
		// save it to the database
		employeeRepository.save(Jim);
		employeeRepository.save(Buzz);

	}

}
