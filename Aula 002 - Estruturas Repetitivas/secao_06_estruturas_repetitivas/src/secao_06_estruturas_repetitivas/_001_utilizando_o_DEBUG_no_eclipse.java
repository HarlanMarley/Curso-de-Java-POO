package secao_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;


/* PARA ACESSAR O DEBUG
 *  1º SELECIONE A LINHA DE ONDE QUE INICIAR.
 *  2º VAI EM RUN
 *  3º APERTE EM TOGGLE BREAKPOINT
 * PARA INICIA O DEBUG
 * 	BOTAO DIREITO NA CLASSE
 * 	DEBUG AS
 * 	JAVA APLICATION
 * PARA EXECUTAR UMA LINHA
 * 	APERTE F6
 */
public class _001_utilizando_o_DEBUG_no_eclipse {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();

	}

}
