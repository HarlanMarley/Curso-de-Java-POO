package sintaxe_opcional__operadores_de_atribuicao_cumulativa;

import java.util.Locale;
import java.util.Scanner;

/* OPERADORES DE ATRIBUIÇÃO CUMULATIVA
 * 
 * a += b; e o mesmo que a = a + b;
 * a -= b; ''         '' a = a - b;
 * a *= b; ''         '' a = a * b;
 * a /= b; ''         '' a = a / b;
 * a %= b; ''         '' a = a % b;
 */

public class sintaxe_opcional_001 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		
		
		sc.close();

	}

}
