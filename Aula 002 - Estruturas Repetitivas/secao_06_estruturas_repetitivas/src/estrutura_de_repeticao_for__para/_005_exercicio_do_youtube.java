package estrutura_de_repeticao_for__para;

import java.util.Scanner;

public class _005_exercicio_do_youtube {

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=JTa8WEhV38E
		// taboada de multiplicação
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int produto = i * N;
			System.out.println(i + " x " + N + " = " + produto);
				
		}
		
		
		
		sc.close();
		
	}

}
