package estrutura_condicional_if_else;

import java.util.Locale;
import java.util.Scanner;

public class _005_Exercicio_Proposto_05 {

	public static void main(String[] args) {
		/* ESCREVER UM PROGRAMA QUE LEIA O
		 * CODIGO DE UM ITEM E A QUANTIDADE
		 * DESTE ITEM, E MOSTRE O VALOR DA 
		 * CONTA.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int codi = sc.nextInt();
		int quant = sc.nextInt();
		
		double tot;
		if (codi == 1) {
			tot = quant * 4.00;
	
			
		}
		else if (codi == 2) {
			tot = quant * 4.50;
			
		}
		else if (codi == 3) {
			tot = quant * 5.00;
		
		}
		else if (codi == 4) {
			tot = quant * 2.00;
		
		}
		else {
			if (codi == 5);
			tot = quant * 1.50;
		
		}
		
		 System.out.printf("Total: R$ %.2f%n", tot);
		
		sc.close();

	}

}
