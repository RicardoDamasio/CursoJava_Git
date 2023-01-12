package EstruturaDeControleExerciciosFinais;

import java.util.Scanner;

public class VerificadorNumeroPar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();
		int resto = numero % 2;
		int InicioIntervalo = 0;
		int FimDoIntervalo = 10;
		
		while (numero>=FimDoIntervalo) {
			
			InicioIntervalo+=10;
			FimDoIntervalo+=10;
			
		}
		if (resto == 0) {
			System.out.println("O número " + numero + " esta entre "+ InicioIntervalo + " e "+ FimDoIntervalo);
			System.out.println("O número " + numero + " é par.");
			}else {
				System.out.println("O número " + numero + " esta entre "+ InicioIntervalo + " e "+ FimDoIntervalo);
				System.out.println("O número " + numero + " é impar.");
			}

		entrada.close();
	}

}
