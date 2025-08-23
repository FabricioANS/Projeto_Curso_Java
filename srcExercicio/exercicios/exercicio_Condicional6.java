package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_Condicional6 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		
		if (n1 >= 0 && n1 <= 25) {
			System.out.printf(n1+ "esta entre 0 a 25.");
		}
		else if (n1 > 25  && n1 <= 50) {
			System.out.printf(n1+ "esta entre 25 a 50.");
		}
		else if (n1 > 50 && n1 <= 75) {
			System.out.printf(n1+ "esta entre 50 a 75.");
		}
		else if(n1 > 75 && n1 <= 100) {
			System.out.printf(n1+ "esta entre 75 a 100.");
		}
		else {
			System.out.println("Fora do intervalo!");
		}
			
		sc.close();

	}	
}
