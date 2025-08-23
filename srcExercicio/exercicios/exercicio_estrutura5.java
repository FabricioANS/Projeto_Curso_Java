package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_estrutura5 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod_Peca1, cod_Peca2, numPeca1, numPeca2;
		double valorPeca1, valorPeca2, calcPag;
		
		cod_Peca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		cod_Peca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		calcPag = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);
			
		System.out.printf("O Valor a ser pago é = R$ %.2f" ,calcPag);
				
		sc.close();

	}	
}
