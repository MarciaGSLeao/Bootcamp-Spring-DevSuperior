package aula;

import java.util.Scanner;

import entities.Product;

public class ProductProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos deseja armazenar? ");
		int quantity = sc.nextInt();
		Product[] vectorProduct = new Product[quantity];
				
		for(int i=0; i<vectorProduct.length; i++) {
			System.out.println("Informe o nome do produto: ");
			sc.next();
			String name = sc.nextLine();
			System.out.println("Informe o preço do produto: ");
			double price = sc.nextDouble();
			vectorProduct[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vectorProduct.length; i++) {
			sum += vectorProduct[i].getPrice();		
		}
		double avg = sum/quantity;
		
		System.out.printf("Média de preço: %.2f%n", avg );
		sc.close();
	}

}
