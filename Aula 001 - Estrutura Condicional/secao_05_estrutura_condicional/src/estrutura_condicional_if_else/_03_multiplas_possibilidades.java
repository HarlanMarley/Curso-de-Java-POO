package estrutura_condicional_if_else;

import java.util.Scanner;

public class _03_multiplas_possibilidades {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else if (hora < 18) {
			System.out.println("boa tarde");
			}
		else {
			System.out.println("boa noite");
			}
				
			sc.close();
				
	}
}
