package application;

import java.util.Scanner;

import entities.Rectangle;

public class RectangleApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Informe a largura e altura do triângulo: ");
		System.out.print("ALTURA: ");
		rectangle.setHeight(sc.nextDouble());
		System.out.print("LARGURA: ");
		rectangle.setWidth(sc.nextDouble());
		System.out.println("AREA = " + rectangle.getArea());
		System.out.println("PERÍMETRO = " + rectangle.getPerimete());
		System.out.println("DIAGONAL = " + rectangle.getDiagonal());
		
		sc.close();
	}
}
