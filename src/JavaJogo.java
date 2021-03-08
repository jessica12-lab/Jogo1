import java.util.Scanner;

public class JavaJogo {

	public static void main(String[] args) {
		String nome;
		String escolha;
		int escolha1 = 1;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Aventuras no trem linha Coral");
		System.out.println("Um jogo de Jessica Amaral");
		System.out.println("Seu objetivo é enfrentar os perigos do metrô e conseguir chegar ao trabalho sem levar nenhuma encoxada ou empurrão.\n Qual é o seu nome?");
		nome = leitor.next();
		System.out.println("Tem coragem de enfrentar o trenzão as 6 da matina? SIM ou NÃO");
		escolha  = leitor.next();
		if (escolha.equalsIgnoreCase("sim")) {
			System.out.println("Você está chegando na catraca, e é imprescindível que esteja  em posse de um objeto lendário para\n conseguir passar as catracas e acessar o metrô, que seria o famoso bilhete único ou o BOM. Você ja está com algum deles em mãos? SIM OU NÃO ");
			escolha =  leitor.next();
			if (escolha.equalsIgnoreCase("sim") ) {
				System.out.println(" Agora você consegue acessar a plataforma do metrô, porém antes de entrar no vagão,\n terá que se posicionar no lugar certo a ponto de descer sem ter que andar muito.\n Agora escolha entre lado DIREITO ou ESQUERDO para entrar.\n Mas lembre-se, o lado esquerdo está muito lotado e a chance de você ser empurrado e ou encoxado, é bem grande. Escolha com atenção! ");
				escolha = leitor.next();
			if(escolha.equalsIgnoreCase("Direito")) {
				System.out.println("Você conseguiu entrar sem nenhum problema,porém na estação Brás, \n você terá que ser muito cuidadoso, pois entrará uma quantidade de gente bem grande e outra quantidade irá sair\n escolha com atenção o lugar que você irá se posicionar: digite 1 para se posicionar:\n  PERTO DA PORTA, digite 2 para se posicionar = NO CORREDOR ou n3 = DE FRENTE PARA A PORTA ABERTA. ");
				escolha1 = leitor.nextInt();
			
				switch (escolha1) {
				
				case 1:
					System.out.println("Você foi jogado para fora do vagão e não conseguiu chegar ao seu trabalho sem nenhuma interferência. GAME OVER :-( ");
					break;
				case 2:System.out.println("Você conseguiu passar pela pior fase, parabéns. A estação Brás é bem difícil mas você conseguiu, você é bom mesmo.");
					break;
				case 3:
					System.out.println("Você foi jogado para fora do vagão e não conseguiu chegar ao seu trabalho sem nenhuma interferência. GAME OVER :-( ");
					break;
				}
				
				
			}else {
				System.out.println("Sinto muito, mas você foi empurrado para fora do vagão, e ainda levou uma encoxada antes. GAME OVER. :-(");
			}
				
			}else {
				System.out.println("Você não poderá passar as catracas e está fora do jogo. GAME OVER :-(");
				
			}
			
		}else {
			System.out.println("Você não está apto ao jogo e está desclassificado. GAME OVER :-(");
		} leitor.close();
		
        
	}

}
