package services;

import entities.Employee;

public class SalaryService {
	
	TaxService taxService;
	PensionService pensionService;
	
	public Double netSalary(Employee employee) {
		Double netSalary = employee.getGrossSalary() - taxService.getTax(employee.getGrossSalary() - pensionService.getDiscount(employee.getGrossSalary()));
		return netSalary;
	}
}
