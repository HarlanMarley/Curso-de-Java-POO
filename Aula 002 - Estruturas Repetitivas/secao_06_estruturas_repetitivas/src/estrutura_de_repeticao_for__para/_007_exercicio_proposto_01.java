package estrutura_de_repeticao_for__para;

import java.util.Scanner;

public class _007_exercicio_proposto_01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		for(int i=1; i<=N; i++) {
			if(i % 2 != 0)
			System.out.println(i);
				
			
		}
		
		sc.close();

	}

}
