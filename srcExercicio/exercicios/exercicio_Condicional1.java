package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_Condicional1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		if (n1 < 0) {
			System.out.println("O numero "+n1+" é NEGATIVO.");
		}
		else {
			System.out.println("O numero "+n1+" é NÃO É NEGATIVO.");
		}
		
		sc.close();

	}	
}
