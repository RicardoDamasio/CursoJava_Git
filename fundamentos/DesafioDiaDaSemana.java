package fundamentos;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		String dia = entrada.nextLine().toUpperCase();
		if ("DOMINGO".equals(dia)) {
			System.out.println("1");
		}else if ("SEGUNDA".equals(dia) || "SEGUNDA-FEIRA".equals(dia) ) 
			{
				System.out.println("2");			
			}else if ("TERÇA".equals(dia) ||"TERCA".equals(dia) || "TERÇA-FEIRA".equals(dia)|| "TERCA-FEIRA".equals(dia)) 
				{
					System.out.println("3");			
				}else if ("QUARTA".equals(dia) || "QUARTA-FEIRA".equals(dia) ) 
					{
						System.out.println("4");			
					}else if ("QUINTA".equals(dia) || "QUINTA-FEIRA".equals(dia)) 
						{
							System.out.println("5");			
						}else if ("SEXTA".equals(dia) || "SEXTA-FEIRA".equals(dia)) 
							{
								System.out.println("6");			
							}else if ("SABADO".equals(dia) || "SÁBADO".equals(dia)) 
								{
									System.out.println("7");			
								}else 
									{
										System.out.println("Dia inválido!!");			
									}			
		
			entrada.close();
				
	}

}
