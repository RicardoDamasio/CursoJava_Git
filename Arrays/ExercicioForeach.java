package Arrays;

import java.util.Arrays;

public class ExercicioForeach {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for (double notaAlunoA:notasAlunoA) {
			totalAlunoA += notaAlunoA;			
		}
		
		System.out.printf("A média de notas é: %.2f",totalAlunoA/notasAlunoA.length);
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		double totalAlunoB = 0;
		for (Double notaAlunoB: notasAlunoB) {
			totalAlunoB += notaAlunoB;				
		}
		
		System.out.printf("\n A média de notas é: %.2f",totalAlunoB/notasAlunoB.length);
		System.out.println(" ");
	}


}
