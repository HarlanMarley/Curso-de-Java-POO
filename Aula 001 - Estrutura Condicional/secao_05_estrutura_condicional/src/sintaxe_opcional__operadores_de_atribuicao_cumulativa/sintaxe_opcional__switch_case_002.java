package sintaxe_opcional__operadores_de_atribuicao_cumulativa;

import java.util.Scanner;

public class sintaxe_opcional__switch_case_002 {
	
	
	/* SINTAXE DO SWITCH-CASE
	 *  switch ( expressão){
	 *  case valor1:
	 *  	comando1
	 *  	comando2
	 *  	break;
	 *  case valor2:
	 *  	comando3
	 *  	comando4
	 *  	break;
	 *  default:
	 *  	comando5
	 *  	comando6
	 *  	break;
	 *  }
	 */ 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}
