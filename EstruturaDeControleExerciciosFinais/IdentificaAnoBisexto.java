package EstruturaDeControleExerciciosFinais;

import java.util.Scanner;

public class IdentificaAnoBisexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um ano de sua escolha:");
		int ano = entrada.nextInt();
		int resto1 = ano%4;
		int resto2 = ano%100;
		if (resto1==0 && resto2==0) {
			System.out.println("O ano de "+ano+ " é bisexto");
		}else{
			System.out.println("O ano de "+ano+ " não é bisexto");
		}	
		
		
		entrada.close();
	}

}
