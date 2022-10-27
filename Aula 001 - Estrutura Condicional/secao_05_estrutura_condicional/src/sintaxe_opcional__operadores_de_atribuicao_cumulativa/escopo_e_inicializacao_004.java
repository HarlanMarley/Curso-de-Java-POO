package sintaxe_opcional__operadores_de_atribuicao_cumulativa;

public class escopo_e_inicializacao_004 {

	public static void main(String[] args) {
		
/*	Demo
double price = sc.nextDouble();
if (price > 100.0) {
double discount = price * 0.1;
}
System.out.println(discount)
*/
		
		double price = 400.00;
		
		double discount;
		
		if (price < 200.00) {
			discount = price * 0.1;
		}
		else {
			discount = 0;
		}
		
		System.out.println(discount);

	}

}
