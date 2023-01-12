package Classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;

	Produto() {

	}

	Produto(String nomeDoProduto, double precoDoProduto) {
		nome = nomeDoProduto;
		preco = precoDoProduto;
	}

	Produto(String nomeDoProduto, double precoDoProduto, double descontoDoProduto) {
		nome = nomeDoProduto;
		preco = precoDoProduto;
		desconto = descontoDoProduto;
	}
	
	
	double precoDesconto () {
		return preco *(1-desconto);
	
		
	}
	

}
