package fundamentos;

public class SaldoComReajuste {
	public static void main(String[] args) {
		var saldo = 233.45;
		var reajuste = 0.01;
		System.out.println("Seu saldo atual é "+ saldo);
		System.out.println("Seu saldo atual com reajuste é "+ "R$ "+ saldo*(1+reajuste));
	}

}
