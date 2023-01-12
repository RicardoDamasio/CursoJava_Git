package EstruturaDeControleExerciciosFinais;

import java.util.Scanner;

public class NumerosPositivos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;
		int soma = 0;

		while (numero1 >= 0 || numero2 >= 0) {

			System.out.println("Digite um numero: ");
			numero1 = entrada.nextInt();
			
			if (numero1 < 0 ) {
				System.out.println(" Desculpe só realizamos somas com numeros positivos");
				break;}
			
			System.out.println("Digite outro numero: ");
			numero2 = entrada.nextInt();
			
			if (numero2 < 0) {
				System.out.println(" Desculpe só realizamos somas com numeros positivos");
				break;
			}else {
				soma = numero1 + numero2;
				System.out.println("A soma dos dois numeros é: " + soma);
			}

		}

		entrada.close();
	}

}
