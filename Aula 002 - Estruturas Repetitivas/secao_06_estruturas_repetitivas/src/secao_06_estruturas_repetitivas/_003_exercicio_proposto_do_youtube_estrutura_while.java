package secao_06_estruturas_repetitivas;

import java.util.Scanner;

public class _003_exercicio_proposto_do_youtube_estrutura_while {

	public static void main(String[] args) {
		// Estrutura while em Java exercício resolvido 01
		// https://www.youtube.com/watch?v=r3qCFqaNHds&ab_channel=educandoweb
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != y) {
			if (x < y) {
				System.out.println("Crecente");
			}
			else {
				System.out.println("Decrescente");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		
		
		sc.close();

	}

}
