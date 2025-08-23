// Define a classe principal do programa.
public class aula5_funcoes {
	
	// Método principal, onde a execução do programa começa.
	public static void main(String[] args) {
			
		// Declara e inicializa variáveis double.
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		// Declara variáveis para armazenar resultados.
		double A, B, C;
			
		// Calcula a raiz quadrada de x.
		A = Math.sqrt(x);       
		// Calcula a raiz quadrada de y.
		B = Math.sqrt(y);       
		// Calcula a raiz quadrada de 25.0.
		C = Math.sqrt(25.0);    
			
		// Exibe os resultados das raízes quadradas.
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25  = " + C);
			
		// Calcula x elevado a y.
		A = Math.pow(x, y);         
		// Calcula x elevado ao quadrado.
		B = Math.pow(x, 2.0);       
		// Calcula 5.0 elevado ao quadrado.
		C = Math.pow(5.0, 2.0);     
			
		// Exibe os resultados das potenciações.
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
			
		// Calcula o valor absoluto de y.
		A = Math.abs(y);    
		// Calcula o valor absoluto de z.
		B = Math.abs(z);    
			
		// Exibe os resultados dos valores absolutos.
		System.out.println("Valor absoluto de "+ y +" = " + A);
		System.out.println("Valor absoluto de "+ z +" = " + B);
	}

}