import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Digite a largura:");
		rec.largura = read.nextDouble();
		
		System.out.println("Digite a altura:");
		rec.altura = read.nextDouble();
		
		double area = rec.area();
		double perimetro = rec.perimetro();
		double diagonal = rec.diagonal();
		
		System.out.println("A área do retângulo é: " + area);
		System.out.println("O perímetro do retângulo é: " + perimetro);
		System.out.println("A diagonal do retângulo é: " + diagonal);
		
		read.close();
		
	}

}
