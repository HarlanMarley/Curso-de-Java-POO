package secao_06_estruturas_repetitivas;

import java.util.Scanner;

public class _002_estrutura_de_repeticao_enquanto_while {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
