package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_estrutura2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
		
		R = sc.nextDouble();

		A = pi * R * R;
			
		System.out.printf("O valor do raio é "+R+"e o valor da area do circulo é ="+A);		
		
		sc.close();

	}	
}
