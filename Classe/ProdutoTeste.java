package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto.desconto = 0.30;
		
		Produto p1 = new Produto();
		p1.nome = "Tenis";
		p1.preco = 199.99;
		
		
		Produto p2 = new Produto ("Bola", 75.00);
		
		double precoFinal = p1.precoDesconto();
		System.out.printf("%s %.2f\n","R$",precoFinal);
		precoFinal = p2.precoDesconto();
		System.out.printf("%s %.2f","R$",precoFinal);
		
		
	}

}
