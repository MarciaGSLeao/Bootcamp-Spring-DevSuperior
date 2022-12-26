package app;

import java.util.Scanner;

import entities.Employee;
import services.SalaryService;

public class Application {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		SalaryService ss = new SalaryService();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe o nome do funcionário: ");		
		employee.setName(sc.nextLine());
		System.out.print("Informe o salário bruto: ");
		employee.setGrossSalary(sc.nextDouble());
		
		System.out.printf("Salário Líquido: R$ %.2f", ss.netSalary(employee));
		
		sc.close();
	}

}
