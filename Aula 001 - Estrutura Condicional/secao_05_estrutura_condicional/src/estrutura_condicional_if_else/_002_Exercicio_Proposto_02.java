package estrutura_condicional_if_else;

import java.util.Scanner;

public class _002_Exercicio_Proposto_02 {

	public static void main(String[] args) {
		/* FAZER UM PROGRAMA PARA LER UM 
		 * NUMERO INTEIRO E DIZER SE ESTE 
		 * NUMERO E PAR OU IMPAR.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int divi;
		int n = sc.nextInt();
		
		// PORCENTAGEM = RESTO DA DIVISAO
		divi = n % 2;
				
		if (divi == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		sc.close();

	}

}
