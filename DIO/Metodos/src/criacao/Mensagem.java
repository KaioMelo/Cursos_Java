package criacao;

public class Mensagem {
	
	public static void obterMensagem(int hora) {
		
		if(hora >= 18 && hora <= 23) {
			
			System.out.println("Boa Noite!");
			
		}else if(hora >= 13 && hora <= 17) {
			
			System.out.println("Boa Tarde!");
			
		}else if(hora >= 5 && hora <= 12) {
			
			System.out.println("Bom dia!");
			
		}else if(hora >= 0 && hora <= 4){
			
			System.out.println("Boa Noite!");
			
		}else {
			System.out.println("Valor inserido não corresponde");
		}
	}
}
