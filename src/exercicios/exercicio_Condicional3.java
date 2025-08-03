package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_Condicional3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("São Múltiplos");
		}
		else {
			System.out.println("NÂO São Múltiplos.");
		}
		
		sc.close();

	}	
}
