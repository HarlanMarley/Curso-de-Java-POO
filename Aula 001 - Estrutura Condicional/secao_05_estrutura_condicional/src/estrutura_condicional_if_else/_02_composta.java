package estrutura_condicional_if_else;

import java.util.Scanner;

public class _02_composta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
			
		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {			
			System.out.println("bom dia!!");
		}
		else {
			System.out.println("boa tarde!!");
		}
		sc.close();	
		
		
		
	}
}
		/* SINTAXE DA ESTRUTURA CONDICIONAL
			COMPOSTA SO TRATA DUAS POSSIBILIDADES,
			O SIM OU O NAO*/