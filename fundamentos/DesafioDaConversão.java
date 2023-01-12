package fundamentos;

import java.util.Scanner;

public class DesafioDaConversão {
	
	public static void main(String[] args) {
			
		
		Scanner entrada = new  Scanner(System.in);  
		
		System.out.print("Digite o ultimo salario: ");
		String UltimoSalario = entrada.nextLine().replace(",", ".");
		
		
		System.out.print("Digite o penultimo salario: ");
		String PenultimoSalario = entrada.nextLine().replace(",", ".");
		
		
		System.out.print("Digite o antipenultimo salario: ");
		String AntipenultimoSalaraio = entrada.nextLine().replace(",", ".");
		
			
		entrada.close();
		
		double ULTIMOSALARIO = Double.parseDouble(UltimoSalario);
		double PENULTIMOSALARIO = Double.parseDouble(PenultimoSalario);	
		double ANTIPENULTIMOSALARIO = Double.parseDouble(AntipenultimoSalaraio);
		double MediaSalarial = (ULTIMOSALARIO+PENULTIMOSALARIO+ANTIPENULTIMOSALARIO)/3;
		System.out.println(" A média dos três ultimos salarios é: " + MediaSalarial);
		
		}
	
	
	}
	


