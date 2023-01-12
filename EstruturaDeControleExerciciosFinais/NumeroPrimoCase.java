package EstruturaDeControleExerciciosFinais;

import java.util.Scanner;

public class NumeroPrimoCase {

	public static void main(String[] args) {

		int contador = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");

		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {

			if (numero % i == 0) {
				contador++;
			}

		}
		switch (contador) {
		case 0: {

			System.out.println(" O número é primo");
			break;
		}
		default:
			System.out.println(" O número não é primo");
			break;
		}

		entrada.close();

	}
}





			