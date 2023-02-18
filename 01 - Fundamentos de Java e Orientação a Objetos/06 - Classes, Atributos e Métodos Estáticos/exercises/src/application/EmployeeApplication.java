package application;

import java.util.Scanner;

import entities.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Informe os dados do funcionário: ");
		System.out.print("Nome: ");
		employee.setName(sc.nextLine());
		System.out.print("Salário Bruto: ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.print("Imposto: ");
		employee.setTax(sc.nextDouble());
		System.out.println("Funcionário: " + employee.getName() + ", R$ " + employee.netSalary());
		
		System.out.print("Qual o percentual de aumento? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Dados atualizados: " + employee.getName() + ", R$ " + employee.netSalary());
		sc.close();
	}
}
