package scr;

public class Main {

	public static void main(String[] args) {
		
		//Metodo Calculadora
		
		System.out.println("------- Exercicio Calculadora  --------");
		Calculadora.soma(5, 5);
		Calculadora.subtrcao(6, 8);
		Calculadora.mutiplicacao(4, 5.6);
		Calculadora.divisao(4, 5);
		
		//Metodo Mensagem
		
		System.out.println(" ------  Obter Mensagem  --------");

		Mensagem.obterMensagem(0);
		Mensagem.obterMensagem(12);
		Mensagem.obterMensagem(18);
		Mensagem.obterMensagem(11);
		Mensagem.obterMensagem(26);
		
		//Metodo Emprestimo
		
		System.out.println("------- Emprestimo -------");
		
		Emprestimo.calcular(1000, 2);
		Emprestimo.calcular(99.10 , 3);
		Emprestimo.calcular(100, 4);
	
		// Area
		Quadrilatero.area(4);
		Quadrilatero.area(3, 4);
		Quadrilatero.area(5, 3, 7);
		
	}

}
