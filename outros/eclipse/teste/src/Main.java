import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int idade = 20;
		double salario = 5900.5;
		double altura = 1.63;
		char genero = 'F';
		String nome = "Maria Silva";
		
		System.out.println("Idade = " + idade);
		System.out.println("Salario = " + salario);
		System.out.println("Altura = " + altura);
		System.out.println("Genero = " + genero);
		System.out.println("Nome = " + nome);
		
	}	

}
