package ClasseExerciciosExtra;

public class Retangulo {
	float lado1;
	float lado2;
	float area;
	float perimetro;
	String nome;

	Retangulo(float lado1, float lado2, String nome) {

		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nome = nome;

	}

	void CalcularArea() {
		if (this.lado1 > 0 && this.lado2 > 0) {
			this.area = lado1 * lado2;
		}else {
			System.out.println("não é possivel realizar calculos com medidas negativas");
		}
		
		

	}

	void CalcularPerimetro() {
		if (this.lado1 > 0 && this.lado2 > 0) {
			this.perimetro = (2 * lado1) + (2 * lado2);
		}else {
			System.out.println("não é possivel realizar calculos com medidas negativas");
		}
		
	}
	
	String mostra() {
		return "A área do " + nome + " é " + area + "M²\n" +
		"O perímetro do " + nome + " é " + perimetro + "m";
	}

}


