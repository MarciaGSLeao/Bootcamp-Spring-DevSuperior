package services;

import entities.Employee;

public class SalaryService {
	
	private TaxService taxService;
	private PensionService pensionService;
	
	public SalaryService(TaxService taxService, PensionService pensionService) {
		this.taxService = taxService;
		this.pensionService = pensionService;
	}
	
	public Double netSalary(Employee employee) {
		Double netSalary = employee.getGrossSalary() 
				- taxService.getTax(employee.getGrossSalary())
				- pensionService.getDiscount(employee.getGrossSalary());
		return netSalary;
	}
}
