package Arrays;

import java.util.Scanner;

public class DesafioDoArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas você irá digitar ?");
		int tamanho = entrada.nextInt();

		double[] notas = new double[tamanho];
		for (int i = 0; i < notas.length; i++) {

			System.out.print("Digite a " + (i+1) + "° nota:");
			notas[i] = entrada.nextDouble();
			System.out.print("\n");
		}

		double totalNota = 0;

		for (double nota : notas) {
			totalNota += nota;

		}

		System.out.print("A média das notas é :" + totalNota / tamanho);
		entrada.close();

	}

}
