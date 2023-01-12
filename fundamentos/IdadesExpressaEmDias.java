package fundamentos;

public class IdadesExpressaEmDias {
	
	public static void main(String[] args) {
		int Anos = 37;
		int Meses = 7;
		int Dias = 12;
		
		int Idade = (Anos*365)+(Meses*30)+Dias;
		
		System.out.println("Você tem " + Anos + " anos " + Meses +" meses "+ Dias + " dias, o que equivale á " + Idade + " dias.");
				
	}

}
