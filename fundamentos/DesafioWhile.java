package fundamentos;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		double valor = 0;
		double total = 0;
		int i = 0;

		Scanner entrada = new Scanner(System.in);

		while (valor != -1) {
			System.out.print("Digite a nota ou -1 para sair: ");
			valor = Double.parseDouble(entrada.nextLine());

			if (valor >= 0 && valor <= 10) {

				total += valor;
				i++;

			}

		}
		double media = total / i;
		System.out.println("mostrar valor média: " + media);

		entrada.close();

	}

}
