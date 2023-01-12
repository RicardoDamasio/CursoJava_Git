package ClasseExerciciosExtra;

public class Funcionario {
	
	String nome;
	String sobreNome;
	int horasTrabalhadas;
	double valorPorHora;
	String juntar;
	int horaAdicional=0;
	
	Funcionario(String nome, String sobreNome, int horasTrabalhadas, double valorPorHora){
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.horasTrabalhadas= horasTrabalhadas;
		this.valorPorHora = valorPorHora;		
	}
	
	double calcularSalario() {
		return (horasTrabalhadas+horaAdicional)*(valorPorHora);
	}
	
	int incremetarHora(int horaAdicional) {
		return this.horaAdicional = horaAdicional;		
		
	}
	
	String nomeCompleto() {
		return  juntar = nome+sobreNome;
	}
	

}
