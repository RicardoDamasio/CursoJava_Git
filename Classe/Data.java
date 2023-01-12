package Classe;

public class Data {
	int Dia =  01;
	int Mes = 01;
	int Ano = 1970;
	
	String dataFormatada() {
		
		return String.format("%d/%d/%d", Dia,Mes,Ano);
	}
	

}
