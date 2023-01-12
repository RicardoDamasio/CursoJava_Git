package fundamentos;

public class ValorIpiPeças {
	public static void main(String[] args) {
		var Cod1 = "P001";
		var Cod2 = "P002";
		int quantidade1 = 2;
		int quantidade2 = 4;
		double ValorUnitario1 = 34.00;
		double ValorUnitario2 = 41.00;
		final double IPI =  12.5;
		
		double ValorTotal = ((ValorUnitario1*quantidade1)+(ValorUnitario2*quantidade2)*(IPI/(100+1)));
		
		System.out.println("O valor unitário da peça " + Cod1 + " é R$ " + ValorUnitario1 );
		System.out.println("O valor unitário da peça " + Cod2 + " é R$ " + ValorUnitario2 );
		System.out.printf("O valor total é R$ "+"%.2f" ,ValorTotal);
		
	}

}
