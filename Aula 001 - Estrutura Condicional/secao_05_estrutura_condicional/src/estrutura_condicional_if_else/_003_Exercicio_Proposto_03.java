package estrutura_condicional_if_else;

import java.util.Scanner;

public class _003_Exercicio_Proposto_03 {

	public static void main(String[] args) {
		/* O PROGRAMA DEVE INDICAR SE OS VALORES
		 * LIDOS SAO MULTIPLOS ENTRE SI.
		 */

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
			
		}
		
		sc.close();
		
		
	}

}
