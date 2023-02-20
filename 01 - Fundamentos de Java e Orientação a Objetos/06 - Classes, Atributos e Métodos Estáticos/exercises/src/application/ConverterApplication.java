package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class ConverterApplication {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dólar? ");
		double priceDolar = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		double amountDolar = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais: R$ %.2f%n", CurrencyConverter.dolarToReal(amountDolar, priceDolar));
		
		sc.close();
		
	}

}
