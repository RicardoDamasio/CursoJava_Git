package Classe;

public class Jantar {
	
public static void main(String[] args) {
	Comida c1 = new Comida("arroz", 0.200);
	Comida c2 = new Comida("feijão", 0.100);
	
	Pessoa p1 = new Pessoa ("Rica", 75.00);
	Pessoa p2 = new Pessoa ("Nina", 84.00);	
	
	System.out.println(p1.apresentar());
	System.out.println(p2.apresentar());
	p2.comer(c1);
	p2.comer(c2);
	p1.comer(c1);
	p1.comer(c2);
	
	System.out.println(p1.apresentar());
	System.out.println(p2.apresentar());
	
	
	
	
	
	
	
}
}
