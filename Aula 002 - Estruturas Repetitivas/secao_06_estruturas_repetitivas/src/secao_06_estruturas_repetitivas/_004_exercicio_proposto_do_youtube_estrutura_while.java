package secao_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class _004_exercicio_proposto_do_youtube_estrutura_while {

	public static void main(String[] args) {
		//https://www.youtube.com/watch?v=vT0QEDHK2yU&ab_channel=educandoweb
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int idade = sc.nextInt();
	int soma = 0;
	int cont = 0;
	
	while ( idade >= 0) {
		soma = soma + idade;
		cont = cont + 1;
		idade = sc.nextInt();
				
	}
	
	if (cont > 0) {
		double media = (double) soma / cont;
		System.out.printf("Media = %.2f%n", media);
	}
	else {
		System.out.println("Impossivel Calcular!!");
	}
	
	sc.close();
		

	}

}
