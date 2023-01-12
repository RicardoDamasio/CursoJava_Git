package ClasseExerciciosExtra;

import java.text.DecimalFormat;

public class Circulo {
	
	float raio;
	double area;
	double perimetro;
	String nome;
	String padrao = "###,###.##";
	String padrao2 = "###,###.##";
	DecimalFormat df = new DecimalFormat(padrao);
	DecimalFormat df2 = new DecimalFormat(padrao2);
	
	
	
		
	
	Circulo (float raio, String nome){
		
		this.raio = raio;
		this.nome = nome;		
	}
	
	void CalculaArea() {
		if (raio>0) {
			area = (Math.PI)*(Math.pow(raio, 2));
				
			
			
		}
		
	}
	
	void CalculaPerimetro() {
		if (raio>0) {
			perimetro = 2*(Math.PI)*raio;
			
		}
		
	}
	
	
	
	String MostraTudo(){
		String str = Double.toString(area);
		str = df.format(area);	
		
		String str2 = Double.toString(perimetro);
		str2 = df2.format(perimetro);	
		
		return "A área do " + nome + " é " + str + " M²\n" +
		"O perímetro do " + nome + " é " + str2 + " m";
	}
	

}
