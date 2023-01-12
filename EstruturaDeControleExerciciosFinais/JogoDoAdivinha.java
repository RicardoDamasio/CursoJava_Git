package EstruturaDeControleExerciciosFinais;

import java.util.Random;
import java.util.Scanner;

public class JogoDoAdivinha {
	public static void main(String[] args) {

		Random aleatorio = new Random();

		int numero = aleatorio.nextInt(100);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Tente adivinhar o numero oculto!!");
		System.out.println("Você tem apenas 10 chances. ");
		System.out.println("Digite um numero entre 0 e 100: ");
		int ValorEscolhido = entrada.nextInt();
		int Chance = 10;
		
		
		while (numero != ValorEscolhido ) {
			if (Chance != 0){
				System.out.println("Você errou !!");
				Chance -= 1;
				System.out.println("Você ainda tem " + Chance + " tentativas, tente novamente:");
				ValorEscolhido = entrada.nextInt();
			}
			if (Chance == 0) {
				System.out.println("Fim de jogo o número oculto era " + numero);
				break;
			}
			if (numero == ValorEscolhido) {
				System.out.println("Parabéns você acertou!!");
				break;
			}
			
						
		}

		entrada.close();

	}

}
