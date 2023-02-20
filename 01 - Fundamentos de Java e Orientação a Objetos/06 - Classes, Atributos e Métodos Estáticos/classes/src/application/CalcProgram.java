package application;

import java.util.Scanner;

import util.Calculator;

public class CalcProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o raio: ");
		double radius = sc.nextDouble();
		
		System.out.printf("Circunferência: %.2f%n", Calculator.circumference(radius));
		System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
		System.out.printf("Valor de PI: %.2f%n", Calculator.PI);
		
		sc.close();
	}

}
