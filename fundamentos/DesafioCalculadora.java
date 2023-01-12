package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1° valor: ");
		String num1 = entrada.next();
		double NUM1 = Double.parseDouble(num1);
		
		System.out.print("Digite o 2° valor: ");
		String num2 = entrada.next();
		double NUM2 = Double.parseDouble(num2);
		
		System.out.print("Digite uma operação: ");
		String operação = entrada.next();
				
		double conta = "+".equals(operação)? NUM1+NUM2: 0;
			   conta = "-".equals(operação)? NUM1-NUM2: conta;
		       conta = "*".equals(operação)? NUM1*NUM2: conta;
		       conta = "/".equals(operação)? NUM1/NUM2: conta;
		
		       System.out.printf("O resultado da sua operação é:" + "%.2f",conta);
		
		entrada.close();	
		
	}

}
