package com.gameleiramag.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gameleiramag.entities.Employee;

@Service
public class SalaryService {
	
	@Autowired
	private TaxService taxService;
	
	@Autowired
	private PensionService pensionService;
	
	/* A annotation 'autowired' pode ser inserida nos atributos que serão dependências
	 * da classe para facilitar a injeção de dependência, dessa forma, pode-se dispensar,
	 * se necessário, a criação dos construtores. Neste caso, a aplicação foi testada e o
	 * construtor se tornou desnecessário.
	 * 
		public SalaryService(TaxService taxService, PensionService pensionService) {
			this.taxService = taxService;
			this.pensionService = pensionService;
		}
	 */
	
	public Double netSalary(Employee employee) {
		Double netSalary = employee.getGrossSalary() 
				- taxService.getTax(employee.getGrossSalary())
				- pensionService.getDiscount(employee.getGrossSalary());
		return netSalary;
	}
}
