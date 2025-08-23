package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_Condicional4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		
		int duracao;
		
		if (h1 < h2) {
			
			duracao = h2 - h1;
		}
		else {
			duracao = 24 - h1 + h2;
		}
		
		System.out.println(" O jogo durou "+duracao+" horas.");
		
		sc.close();

	}	
}
