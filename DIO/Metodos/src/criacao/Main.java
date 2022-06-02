package criacao;

public class Main {

	public static void main(String[] args) {
		
		// Calculadora
		System.out.println("Exercicio Calculadora");
		Calculadora.soma(6, 5);
		Calculadora.subtracao(4, 2);
		Calculadora.multiplicacao(3, 3);
		Calculadora.divisao(10, 2);
		
		//Mensagem
		Mensagem.obterMensagem(8);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(2);
		
		//Empréstimo
		Emprestimo.calcular(200, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(300, Emprestimo.getTresParcelas());
		Emprestimo.calcular(100, 4);
				
	}

}
