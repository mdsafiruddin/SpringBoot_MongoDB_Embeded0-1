package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Employee;
import com.app.repo.EmployeeRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		repo.save(new Employee(11,"ram",6.9));
		repo.save(new Employee(17,"rama",8.9));
		repo.save(new Employee(18,"ramam",5.9));
		repo.save(new Employee(19,"rasam",8.4));
		repo.findAll().forEach(System.out::println);
	

	}

}
