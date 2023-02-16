package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Informe os lados do primeiro triângulo: ");
		x.setSideA(sc.nextDouble());
		x.setSideB(sc.nextDouble());
		x.setSideC(sc.nextDouble());
		System.out.println("Informe os lados do segundo triângulo: ");
		y.setSideA(sc.nextDouble());
		y.setSideB(sc.nextDouble());
		y.setSideC(sc.nextDouble());
		
		System.out.printf("Área do 1º triângulo: %.2f%n", x.getArea());
		System.out.printf("Área do 2º triângulo: %.2f%n", y.getArea());
		
		if(x.getArea() > y.getArea()) {
			System.out.println("O Primeiro Triângulo é maior que o segundo.");
		}else {
			System.out.println("O Segundo Triângulo é maior que o primeiro.");
		}
		
		sc.close();
	}
}
