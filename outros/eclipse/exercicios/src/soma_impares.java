import java.util.Scanner;

public class soma_impares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > y) {
			int troca = x;
			x = y;
			y = troca;
		}
		
		int soma = 0;
		for (int i = x+1; i < y; i++) {
			if (i % 2 != 0) {
			    soma = soma + i;
			}
		}
		
		System.out.println("Soma dos impares = " + soma);
		
		sc.close();
			
	}
}