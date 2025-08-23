package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_estrutura6 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A, B, C;
		double pi = 3.14159;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		float areaTri = (A * C) / 2;
		double areaCirc = pi * (C*C);
		float areaTrap = ((A + B) * C) / 2;
		float areaQuad = B * B;
		float areaRet = A * B;
			
		System.out.printf("A Área do Triangulo é = R$ %.3f%n" ,areaTri);
		System.out.printf("A Área do Circulo é = R$ %.3f%n" ,areaCirc);
		System.out.printf("A Área do Trapézio é = R$ %.3f%n" ,areaTrap);
		System.out.printf("A Área do Quadrado é = R$ %.3f%n" ,areaQuad);
		System.out.printf("A Área do Retângulo é = R$ %.3f%n" ,areaRet);
				
		sc.close();

	}	
}
