package estrutura_de_repeticao_for__para;

import java.util.Scanner;

public class _001_estrutura_repetitiva_for {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		int soma = 0;
		for ( int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		
		
		sc.close();

	}

}
