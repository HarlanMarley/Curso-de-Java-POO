package estrutura_de_repeticao_for__para;

import java.util.Scanner;

public class _006_exercicio_do_youtube {

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=RVJnkOyc7Kk

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min, max;
		if(x < y) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		for(int i=min+1; i<max; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
				
			}
		}
		
		System.out.println(soma);
		
		sc.close();
		
		
		
		
	}

}
