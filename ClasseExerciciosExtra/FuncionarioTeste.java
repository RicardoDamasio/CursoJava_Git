package ClasseExerciciosExtra;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario f1  = new Funcionario("Luis ", "Silva",10, 25.50);
		f1.calcularSalario();
		
		System.out.println(f1.calcularSalario());
		
		System.out.printf("O salario de " + f1.nomeCompleto()+ " é "+ " R$ %.2f",f1.calcularSalario());
		f1.incremetarHora(10);
		System.out.printf("\nO salario de " + f1.nomeCompleto()+ " é "+ " R$ %.2f",f1.calcularSalario());
		
		
		
	}

}
