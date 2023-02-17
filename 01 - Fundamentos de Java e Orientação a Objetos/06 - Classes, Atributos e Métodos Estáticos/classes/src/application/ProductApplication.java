package application;

import java.util.Scanner;

import entities.Product;

public class ProductApplication {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Informe os dados do produto: ");
		System.out.print("Nome: ");
		product.setName(sc.nextLine());
		System.out.print("Preço: ");
		product.setPrice(sc.nextDouble());
		System.out.print("Quantidade: ");
		product.setQuantity(sc.nextInt());
		
		System.out.println(product.toString());
		
		System.out.print("\nInforme a quantidade a ser adicionada no estoque: ");
		product.addProduct(sc.nextInt());

		System.out.println(product.toString());
		
		System.out.print("\nInforme a quantidade a ser removida do estoque: ");
		product.removeProduct(sc.nextInt());
		
		System.out.println(product.toString());
		
		sc.close();
	}

}
