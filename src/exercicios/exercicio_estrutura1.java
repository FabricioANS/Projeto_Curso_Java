package exercicios;
import java.util.Scanner;

public class exercicio_estrutura1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
				
		System.out.printf("A Soma do numero " +n1+ " e do numero " +n2+" é igual a "+soma);		
		
		sc.close();

	}	
}
