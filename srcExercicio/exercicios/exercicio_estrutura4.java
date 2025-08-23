package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_estrutura4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc, numHoras;
		double valorRec, calcSal;
		
		numFunc = sc.nextInt();
		numHoras = sc.nextInt();
		valorRec = sc.nextDouble();
						
		calcSal = numHoras * valorRec;
			
		System.out.println("O numero de funcionários é = " + numFunc);
		System.out.printf("O salário por funcionário é = %.2f" ,calcSal);
		
		sc.close();

	}	
}
