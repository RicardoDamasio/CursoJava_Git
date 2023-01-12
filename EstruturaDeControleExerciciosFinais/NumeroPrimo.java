package EstruturaDeControleExerciciosFinais;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;

		System.out.println("Digite um numero inteiro: ");
		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {

			if (numero % i == 0) {
				contador++;

			}

		}
		if (contador == 0) {
			System.out.println("O numero é primo");
		} else
			System.out.println("O numero não é primo");

		entrada.close();
	}

}
