import java.util.Scanner;

public class JogoDaVelha {
	
	Scanner scan = new Scanner(System.in);
	
	private String nomeJogador1, nomeJogador2;
	private int jogada1, jogada2;
	char p1 = '-', p2 = '-', p3 = '-', p4 = '-', p5 = '-', p6 = '-', p7 = '-', p8 = '-', p9 = '-';

	public JogoDaVelha() {
		menuJogo();
	}
	
	public void menuJogo() {
		
		System.out.println("Sejam Bem-vindxs ao Jogo da Velha\n");
		System.out.print("Digite o nome do jogador 1: ");
		nomeJogador1 = scan.nextLine();
		System.out.print("Digite o nome do jogador 2: ");
		nomeJogador2 = scan.nextLine();		
		
		Intrucoes();
		Jogar();
	}
	
	public void Intrucoes() {
		
		System.out.println("\n------ Instruções do Jogo ------\n");
		System.out.println("*Jogador 1 = X   |  Jogador 2 = O");
		System.out.println("*Digite o número referente a posição que deseja*\n");
		System.out.println("(1) | (2) | (3) \n" +
						   "----------------\n" +
				           "(4) | (5) | (6) \n" +
				           "----------------\n" +
				           "(7) | (8) | (9) \n");
		
	}
	
	public void Jogar() {
		System.out.println("----- Preparando o jogo -----\n");
		
		for(int i=0; i<=4; i++) {	
			System.out.print(nomeJogador1 + " digite a posição: ");
			jogada1 = scan.nextInt();
			Posicoes(jogada1, 1);
			ImprimiJogadas();
			if(VerificaJogada()) {
				System.out.println("Parabéns " + nomeJogador1 + "! Você ganhouuuu!!");				
				break;
			}
			
			if(i == 4) {
				System.out.println("Deu velhaaaaa!! Não foi dessa vez...");
				break;
			}
			
			System.out.print(nomeJogador2 + " digite a posição: ");
			jogada2 = scan.nextInt();
			Posicoes(jogada2, 2);
			ImprimiJogadas();
			if(VerificaJogada()) {
				System.out.println("Parabéns " + nomeJogador2 + "! Você ganhouuuu!!");				
				break;
			}
			
		}
					
	}
	
	public void Posicoes(int pos, int num) {
		
		if(pos == 1) {
			if(num == 1) p1 = 'X';
			else if(num == 2) p1 = 'O';
			
		} else if(pos == 2) {
			if(num == 1) p2 = 'X';
			else if(num == 2) p2 = 'O';
			
		}  else if(pos == 3) {
			if(num == 1) p3 = 'X';
			else if(num == 2) p3 = 'O';
			
		}  else if(pos == 4) {
			if(num == 1) p4 = 'X';
			else if(num == 2) p4 = 'O';
			
		}  else if(pos == 5) {
			if(num == 1) p5 = 'X';
			else if(num == 2) p5 = 'O';
			
		}  else if(pos == 6) {
			if(num == 1) p6 = 'X';
			else if(num == 2) p6 = 'O';
			
		}  else if(pos == 7) {
			if(num == 1) p7 = 'X';
			else if(num == 2) p7 = 'O';
			
		}  else if(pos == 8) {
			if(num == 1) p8 = 'X';
			else if(num == 2) p8 = 'O';
			
		} else if(pos == 9) {
			if(num == 1) p9 = 'X';
			else if(num == 2) p9 = 'O';
			
		} 		
		
	}
	
	public void ImprimiJogadas() {
		System.out.println( p1 + " | " + p2 + " | " + p3 + "\n" +
						   "-----------\n" +
						   	p4 + " | " + p5 + " | " + p6 + "\n" +
		                   "-----------\n" +
		                    p7 + " | " + p8 + " | " + p9 + "\n" );
	}
	
	public boolean VerificaJogada() {
		boolean retorno = false;
		
		if((p1 == 'X' && p2 == 'X' && p3 == 'X') || (p1 == 'O' && p2 == '0' && p3 == '0')) {
			retorno = true;
		} else if((p4 == 'X' && p5 == 'X' && p6 == 'X') || (p4 == 'O' && p5 == '0' && p6 == '0')) {
			retorno = true;
		} else if((p7 == 'X' && p8 == 'X' && p9 == 'X') || (p7 == 'O' && p8 == '0' && p9 == '0')) {
			retorno = true;
		} else if((p1 == 'X' && p4 == 'X' && p7 == 'X') || (p1 == 'O' && p4 == '0' && p7 == '0')) {
			retorno = true;
		} else if((p2 == 'X' && p5 == 'X' && p8 == 'X') || (p2 == 'O' && p5 == '0' && p8 == '0')) {
			retorno = true;
		} else if((p3 == 'X' && p6 == 'X' && p9 == 'X') || (p3 == 'O' && p6 == '0' && p9 == '0')) {
			retorno = true;
		} else if((p1 == 'X' && p5 == 'X' && p9 == 'X') || (p1 == 'O' && p5 == '0' && p9 == '0')) {
			retorno = true;
		} else if((p3 == 'X' && p5 == 'X' && p7 == 'X') || (p3 == 'O' && p5 == '0' && p7 == '0')) {
			retorno = true;
		}
		
		return retorno;
	}
	
}
