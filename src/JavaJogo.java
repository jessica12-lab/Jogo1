import java.util.Scanner;

public class JavaJogo {

	public static void main(String[] args) {
		String nome;
		String escolha;
		int escolha1 = 1;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Aventuras no trem linha Coral");
		System.out.println("Um jogo de Jessica Amaral");
		System.out.println("Seu objetivo � enfrentar os perigos do metr� e conseguir chegar ao trabalho sem levar nenhuma encoxada ou empurr�o.\n Qual � o seu nome?");
		nome = leitor.next();
		System.out.println("Tem coragem de enfrentar o trenz�o as 6 da matina? SIM ou N�O");
		escolha  = leitor.next();
		if (escolha.equalsIgnoreCase("sim")) {
			System.out.println("Voc� est� chegando na catraca, e � imprescind�vel que esteja  em posse de um objeto lend�rio para\n conseguir passar as catracas e acessar o metr�, que seria o famoso bilhete �nico ou o BOM. Voc� ja est� com algum deles em m�os? SIM OU N�O ");
			escolha =  leitor.next();
			if (escolha.equalsIgnoreCase("sim") ) {
				System.out.println(" Agora voc� consegue acessar a plataforma do metr�, por�m antes de entrar no vag�o,\n ter� que se posicionar no lugar certo a ponto de descer sem ter que andar muito.\n Agora escolha entre lado DIREITO ou ESQUERDO para entrar.\n Mas lembre-se, o lado esquerdo est� muito lotado e a chance de voc� ser empurrado e ou encoxado, � bem grande. Escolha com aten��o! ");
				escolha = leitor.next();
			if(escolha.equalsIgnoreCase("Direito")) {
				System.out.println("Voc� conseguiu entrar sem nenhum problema,por�m na esta��o Br�s, \n voc� ter� que ser muito cuidadoso, pois entrar� uma quantidade de gente bem grande e outra quantidade ir� sair\n escolha com aten��o o lugar que voc� ir� se posicionar: digite 1 para se posicionar:\n  PERTO DA PORTA, digite 2 para se posicionar = NO CORREDOR ou n3 = DE FRENTE PARA A PORTA ABERTA. ");
				escolha1 = leitor.nextInt();
			
				switch (escolha1) {
				
				case 1:
					System.out.println("Voc� foi jogado para fora do vag�o e n�o conseguiu chegar ao seu trabalho sem nenhuma interfer�ncia. GAME OVER :-( ");
					break;
				case 2:System.out.println("Voc� conseguiu passar pela pior fase, parab�ns. A esta��o Br�s � bem dif�cil mas voc� conseguiu, voc� � bom mesmo.");
					break;
				case 3:
					System.out.println("Voc� foi jogado para fora do vag�o e n�o conseguiu chegar ao seu trabalho sem nenhuma interfer�ncia. GAME OVER :-( ");
					break;
				}
				
				
			}else {
				System.out.println("Sinto muito, mas voc� foi empurrado para fora do vag�o, e ainda levou uma encoxada antes. GAME OVER. :-(");
			}
				
			}else {
				System.out.println("Voc� n�o poder� passar as catracas e est� fora do jogo. GAME OVER :-(");
				
			}
			
		}else {
			System.out.println("Voc� n�o est� apto ao jogo e est� desclassificado. GAME OVER :-(");
		} leitor.close();
		
        
	}

}
