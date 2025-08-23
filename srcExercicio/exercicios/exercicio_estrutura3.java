package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_estrutura3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, D, calc;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		D = sc.nextDouble();
				
		calc = (A * B) - (C * D);
			
		System.out.printf("O resultado do calculo é = "+calc);		
		
		sc.close();

	}	
}
