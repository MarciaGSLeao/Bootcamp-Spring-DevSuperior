package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Informe nomes para armazenas na lista:");
			String[] vector = sc.nextLine().split(",");
			
			System.out.print("Qual posiçao deseja exibir no console? ");
			int position = sc.nextInt();
			System.out.println(vector[position]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inexistente.");
		}catch (InputMismatchException e) {
			System.out.println("Informe um valor numérico para a posição.");
		}
		
		sc.close();
	}
}
