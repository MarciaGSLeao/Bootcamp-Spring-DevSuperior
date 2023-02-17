package com.gameleiramag.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.gameleiramag.entities.Employee;
import com.gameleiramag.services.SalaryService;

@SpringBootApplication
@ComponentScan({"com.gameleiramag"})
public class Application implements CommandLineRunner{
	
	private SalaryService salaryService;
	
	public Application(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Márcia Gameleira", 4000.00);
		System.out.println(salaryService.netSalary(employee));
	}

}
