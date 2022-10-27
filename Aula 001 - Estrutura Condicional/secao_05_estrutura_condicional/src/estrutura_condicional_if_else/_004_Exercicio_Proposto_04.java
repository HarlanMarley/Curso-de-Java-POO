package estrutura_condicional_if_else;

import java.util.Scanner;

public class _004_Exercicio_Proposto_04 {

	public static void main(String[] args) {
		/* CALCULAR A DURAÇÃO DO JOGO, SABENDO
		 * QUE O MESMO PODE COMEÇAR EM UM DIA E 
		 * TERMINAR EM OUTRO.
		 */

		
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		
		int duracao;
		if (inicio < fim) {
			duracao = fim - inicio;
		}
		else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		sc.close();
		
		
	}

}
