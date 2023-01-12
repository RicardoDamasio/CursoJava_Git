package fundamentos;

import java.util.Scanner;

public class WhileIndetermnado {
	public static void main(String[] args) {
		String valor = "";
		Scanner entrada = new Scanner(System.in);
		
		while(!valor.equalsIgnoreCase("sair")){
			System.out.print("Você diz: ");
			valor = entrada.nextLine();			
		}
				
		entrada.close();
				
	}
	
}
