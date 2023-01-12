package EstruturaDeControleExerciciosFinais;

import java.util.Scanner;

public class PalavraLetraPorLetra {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String Palavrinha = entrada.nextLine();

		char letras[] = Palavrinha.toCharArray();

		for (int i = 0; i < Palavrinha.length(); i++) {
			System.out.println(letras[i]);
		}

		entrada.close();
	}

}
