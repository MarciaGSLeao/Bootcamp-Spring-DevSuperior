package aula;

import java.util.Scanner;

/**
		 Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		 e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */

public class NegativesNumbersProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantos números deseja armazenar? ");
		Integer quantity = sc.nextInt();
		
		Integer[] numbers = new Integer[quantity];
		System.out.println("Informe os números: ");
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] < 0) {
				System.out.printf("%d%n", numbers[i]);
			}
		}
	
		sc.close();
		
	}

}
