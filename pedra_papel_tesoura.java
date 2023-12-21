package ppt;
import java.util.Scanner;
public class pedra_papel_tesoura {
	public static void main(String[] args) {
		String continuar = "s";
		Scanner jogar = new Scanner(System.in);
			while("s".equals(continuar)) {
				
				System.out.print("pedra, papel ou tesoura: " );
				String jogador1 = jogar.next().toLowerCase();
				
				System.out.print("pedra, papel ou tesoura: ");
				String jogador2 = jogar.next().toLowerCase();
				
				Scanner pergunta = new Scanner(System.in);
				
			if(jogador1.equals("pedra") && jogador2.equals("papel")) {
				System.out.print("jogador 2 ganhou");
	
			}else if(jogador1.equals("pedra") && jogador2.equals("tesoura")) {
				System.out.print("Jogador 1 ganhou");
				
			}else if(jogador1.equals("pedra") && jogador2.equals("pedra")) {
				System.out.print("Empate");
				
			}else if(jogador1.equals("papel") && jogador2.equals("pedra")) {
				System.out.print("jogador 1 ganhou");
				
			}else if(jogador1.equals("papel") && jogador2.equals("tesoura")) {
				System.out.print("jogador 2 ganhou");
				
			}else if(jogador1.equals("papel") && jogador2.equals("papel")) {
				System.out.print("Empate");
				
			}else if(jogador1.equals("tesoura") && jogador2.equals("pedra")) {
				System.out.print("jogador 2 ganhou");
				
			}else if(jogador1.equals("tesoura") && jogador2.equals("papel")) {
				System.out.print("jogador 1 ganhou");
				
			}else if(jogador1.equals("tesoura") && jogador2.equals("tesoura")) {
				System.out.print("Empate");
				
			}else {
				System.out.print("opcao invalida");
			}
		System.out.println(" ");
		System.out.print("deseja continuar? ");
		continuar = pergunta.next().toLowerCase();
	}

  }
}
