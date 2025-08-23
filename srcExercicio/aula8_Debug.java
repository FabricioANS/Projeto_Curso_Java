import java.util.Locale; // Importa a classe Locale para configurar a formatação de números.
import java.util.Scanner; // Importa a classe Scanner para ler entrada de dados do usuário.

// Define a classe principal do programa.
public class aula8_Debug {
	
	// Método principal, onde a execução do programa começa.
	public static void main(String[] args) {
	
		// Define a localidade padrão como EUA para usar ponto como separador decimal.
		Locale.setDefault(Locale.US); 
		// Cria um objeto Scanner para ler dados do teclado.
		Scanner sc = new Scanner(System.in);
		
		// Lê a largura (double) digitada pelo usuário.
		double largura = sc.nextDouble();
		// Lê o comprimento (double) digitado pelo usuário.
		double comprimento = sc.nextDouble();
		// Lê o valor do metro quadrado (double) digitado pelo usuário.
		double metroQuadrado = sc.nextDouble();
		
		// Calcula a área multiplicando largura por comprimento.
		double area = largura * comprimento;
		// Calcula o preço total multiplicando a área pelo valor do metro quadrado.
		double preco = area * metroQuadrado;
		
		// Imprime a área formatada com 2 casas decimais. '%n' insere uma nova linha.
		System.out.printf("AREA = %.2f%n", area);
		// Imprime o preço formatado com 2 casas decimais. '%n' insere uma nova linha.
		System.out.printf("PRECO = %.2f%n", preco);
		
		// Fecha o objeto Scanner para liberar recursos.
		sc.close();
	}
}