package relacao.heranca.ex1;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		//UPCAST
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		
		//DOWNCAST
		Vendedor vendedor_ = (Vendedor) new Funcionario();

	}

}
