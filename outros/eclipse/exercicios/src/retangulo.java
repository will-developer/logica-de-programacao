import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class retangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base do retangulo: ");
		double base = sc.nextDouble();
		
		System.out.print("Altura do retangulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = base * 2 + altura * 2;
		double diagonal = Math.sqrt(base * base + altura * altura);
		
		System.out.println("Area = " + String.format("%.4f", area));
		System.out.println("Perimetro = " + String.format("%.4f", perimetro));
		System.out.println("Diagonal = " + String.format("%.4f", diagonal));
		
		sc.close();
	}
}
