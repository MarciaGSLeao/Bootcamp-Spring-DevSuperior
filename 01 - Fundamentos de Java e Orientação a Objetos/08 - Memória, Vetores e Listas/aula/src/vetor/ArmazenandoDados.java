package vetor;

import java.util.Scanner;

public class ArmazenandoDados {
	
//	FAZER UM PROGRAMA QUE LEIA AS ALTURAS DE UM NÚMERO DE PESSOAS E DEVOLVA A MÉDIA.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o número de pessoas: ");
		int n = sc.nextInt();
		
		double vector[] = new double[n];
		double sum = 0.0;
		
		for(int i=0; i<n; i++) {
			System.out.print("Informe a altura: ");
			vector[i] = sc.nextDouble();
			sum += vector[i];
		}

		double average = sum / (double) n;
		System.out.printf("Média das alturas: %.2f%n", average);
		sc.close();
	}

}
