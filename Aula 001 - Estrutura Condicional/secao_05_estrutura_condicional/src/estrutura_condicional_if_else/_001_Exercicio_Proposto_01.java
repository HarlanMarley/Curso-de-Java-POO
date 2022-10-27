package estrutura_condicional_if_else;

import java.util.Scanner;

public class _001_Exercicio_Proposto_01 {

	public static void main(String[] args) {
		/* FAZER UM PROGRAMA PARA LER UM NUMERO INTEIRO,
		 * E DEPOIS DIZER SE ESTE NUMERO E NEGATIVO OU NAO.
		 */

		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
				
		
		if (a < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		
		sc.close();
		
	}

}
