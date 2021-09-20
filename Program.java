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
		
		System.out.println("A �rea do ret�ngulo �: " + area);
		System.out.println("O per�metro do ret�ngulo �: " + perimetro);
		System.out.println("A diagonal do ret�ngulo �: " + diagonal);
		
		read.close();
		
	}

}
