package app;

import java.util.Scanner;

import entities.Employee;
import services.BrazilPensionService;
import services.BrazilTaxService;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

public class Application {
	
	public static void main(String[] args) {
		
		TaxService taxService = new BrazilTaxService();
		PensionService pensionService = new BrazilPensionService();
		Employee employee = new Employee();
		
		SalaryService ss = new SalaryService(taxService, pensionService);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe o nome do funcionário: ");		
		employee.setName(sc.nextLine());
		System.out.print("Informe o salário bruto: ");
		employee.setGrossSalary(sc.nextDouble());
		
		System.out.printf("Salário Líquido: R$ %.2f.", ss.netSalary(employee));
		
		sc.close();
	}

}