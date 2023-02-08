package app;

import java.util.Scanner;

import entities.Employee;
import services.PensionService;
import services.PensionServiceBrazil;
import services.TaxService;
import services.TaxServiceBrazil;

public class Application {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salário Bruto: ");
		Double grossSalary = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary);
		TaxService taxService = new TaxServiceBrazil();
		PensionService pensionService = new PensionServiceBrazil();
		
		/* FORMA NÃO RECOMENDADA!
		Double netSalary = grossSalary * 0.7;
		System.out.printf("Salário Líquido = R$ %.2f", netSalary);
		 */

		Double netSalary = employee.getGrossSalary() - taxService.getTax(employee.getGrossSalary()) - pensionService.getDiscount(employee.getGrossSalary());
		System.out.printf("Salário Líquido = R$ %.2f", netSalary);
		
		sc.close();
	}
}
