package estrutura_de_repeticao_for__para;

public class _004_exercicio_de_mesa_for {

	public static void main(String[] args) {
		
		//001
		int x = 4;
		int y = x + 2;
		
		for(int i=0; i<x; i++) {
			System.out.print(x+" "+y);
			y = y + i;
		}
		System.out.println();
		System.out.println();
		
		
		//002
		for(int i=1; i<5; i++) {
			y = i - 1;
			x = i * 10;
			System.out.print(i);
		}
		System.out.println();
		System.out.println();
		
		
		//003
		int y2 = 10;
		
		for(int i=0; i<4; i++) {
			System.out.print(i);
			y2 = y2 + i;
			System.out.println(y2);
		}
		System.out.println();
		System.out.println();
		
		
		//004
		int x3 = 4;
		int y3 = 0;
		
		for(int i=0; i<x3; i++) {
			System.out.print(i);
			System.out.println(x3);
			y3 = y3 + 10;
		}
		System.out.println();
		System.out.println();
		
		
		//005
		int x1 = 4;
		int y1 = 0;
		
		for(int i1=0; i1<x1; i1++) {
			y1 = y1 + i1;
		}
		System.out.println(y1);
		System.out.println();
		System.out.println();
		
		
		//006
		int x4 = 8;
		int y4 = 3;
		
		for(int i=0; y4<x4; i++) {
			x4 = x4 - 2;
			y4 = y4 + 1;
			System.out.println(i);
			
		}
		
		
		
	}
	
}
