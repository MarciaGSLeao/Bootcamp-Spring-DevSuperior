package application;

import java.util.Scanner;

import entities.Student;

public class StudentApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Informe o nome: ");
		student.setName(sc.nextLine());
		//sc.nextLine();
		System.out.print("Informe a nota do primeiro trimestre: ");
		student.setGradeA(sc.nextDouble());
		System.out.print("Informe a nota do segundo trimestre: ");
		student.setGradeB(sc.nextDouble());
		System.out.print("Informe a nota do terceiro trimestre: ");
		student.setGradeC(sc.nextDouble());
		
		if(student.gradeFinal() >= 60) {
			System.out.println("NOTA FINAL = " + student.gradeFinal());
			System.out.println("Você foi aprovado(a)!");
		}else {
			double remaining = 60 - student.gradeFinal();
			System.out.println("NOTA FINAL = " + student.gradeFinal());
			System.out.println("Você foi reprovado(a)!");
			System.out.println("Faltaram " + remaining + " pontos para ser aprovado(a).");
		}
		
		sc.close();
	}
}
