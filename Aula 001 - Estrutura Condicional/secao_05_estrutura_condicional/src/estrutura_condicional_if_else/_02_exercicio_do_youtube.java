package estrutura_condicional_if_else;

import java.util.Locale;
import java.util.Scanner;

public class _02_exercicio_do_youtube {

	public static void main(String[] args) {
	/* ° Delta nao pode ser negativo
	 * ° 'A' nao pode ser zero
	 * 
	 *      formula de Delta
	 *      Delta = b²-4ac
	 *      
	 *      Equação do segundo grau
	 *          ax²+bx+c = 0	
	 */
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		//formula de delta
		double delta = b * b - 4.0 *a *c;
		
		if (a == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
		}
		else {
			//formula de baskara
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		
		
		sc.close();
		
		
		

	}

}
