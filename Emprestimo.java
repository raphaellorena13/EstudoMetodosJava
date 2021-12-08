package scr;

public class Emprestimo {

	private static double getTaxaDoisMeses() {
		return 0.45;
	} 
	
	private static double getTaxaTresMeses() {
		return 0.9;
	}
	
	public static void calcular(double valor, int parcelas) {
		if (parcelas == 2) {
			 double resultado= (valor * getTaxaDoisMeses()) + valor;
			
			 System.out.println("Valor do emprestimo ficou em : " + resultado);
		}
		else if (parcelas == 3) {
			double resultado = (valor * getTaxaTresMeses()) + valor;
			
			System.out.println("Valor do emprestimo ficou em : " + resultado);
		} 
		else {
			System.out.println("Quantidade de parcelas invalidas");
			
		}
	}
	
}
