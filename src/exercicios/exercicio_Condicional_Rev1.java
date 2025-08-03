package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_Condicional_Rev1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double notaFinal = nota1 + nota2;
			
		System.out.printf("Nota Final é = R$ %.1f%n",notaFinal);
		
		if (notaFinal < 60.0) {
			System.out.println("Reprovado");
		}
		
		sc.close();

	}	
}
