package sintaxe_opcional__operadores_de_atribuicao_cumulativa;

import java.util.Scanner;

public class expressao_condicional_ternaria_003 {

	public static void main(String[] args) {
/*
  Estrutura opcional ao if-else quando
  se deseja decidir um VALOR com base em uma condição.
  
Sintaxe:
( condição ) ? valor_se_verdadeiro : valor_se_falso

EXEMPLO:
(2>4) ? 50 : 80 ENTAO RESP. 80
(10!=3) ? "MARIA" : "ALEX" ENTAO RESP. "MARIA"
*/
		
		
	Scanner sc = new Scanner(System.in);
	
	double preco = 34.5;
	double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
	
	
	System.out.println(desconto);
	
	sc.close();
	
		

	}

}
