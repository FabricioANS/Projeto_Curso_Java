package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_Condicional_Rev3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c) {
			
			System.out.println("Menor = "+a);
		}
		else if(b < c) {
			System.out.println("Menor = "+b);
		}
		else {
			System.out.println("Menor = "+c);
		}
		
		sc.close();

	}	
}
