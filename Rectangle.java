package entities;

public class Rectangle {

	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return (largura + altura)*2;
	}
	
	public double diagonal() {
		double x = (altura*altura)+(largura*largura);
		return Math.sqrt(x);
	}
}
