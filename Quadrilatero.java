package scr;

public class Quadrilatero {
	
	public static double area(double lado) {
	
		return lado * lado;
	
	}
	
	public static double area(double lado1, double lado2) {
		
		return lado1 * lado2;
		
	}
	
	public static double area(double baseMaior, double baseMenor, double altura) {
		double resultado = ((baseMaior+baseMenor)*altura) / 2;
		return resultado;
		
	}
	
}
