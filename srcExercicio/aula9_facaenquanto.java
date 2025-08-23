import java.util.Locale; // Importa a classe Locale para configurar a formatação de números.
import java.util.Scanner; // Importa a classe Scanner para ler entrada de dados do usuário.

// Define a classe principal do programa.
public class aula9_facaenquanto {
	
	// Método principal, onde a execução do programa começa.
	public static void main(String[] args) {
		
		// Define a localidade padrão como EUA para usar ponto como separador decimal.
		Locale.setDefault(Locale.US);
		// Cria um objeto Scanner para ler dados do teclado.
		Scanner sc = new Scanner(System.in);

		// Declara uma variável para armazenar a resposta do usuário sobre repetir.
		char resp;
		// Inicia um laço 'do-while', que executa o bloco de código pelo menos uma vez.
		do {
			// Solicita ao usuário que digite a temperatura em Celsius.
			System.out.print("Digite a temperatura em Celsius: ");
			// Lê o valor double digitado pelo usuário e armazena em 'c'.
			double c = sc.nextDouble();
			// Converte a temperatura de Celsius para Fahrenheit.
			double f = 9.0 * c /5 +32;
			// Imprime a temperatura em Fahrenheit formatada com uma casa decimal.
			System.out.printf("Em Fahrenheit: %.1f%n", f);
			// Pergunta ao usuário se deseja repetir.
			System.out.println("Repetir? (s/n)");
			// Lê a primeira letra da resposta do usuário e armazena em 'resp'.
			resp = sc.next().charAt(0);
		// O laço continua enquanto a resposta 'resp' não for 'n'.
		}while(resp != 'n');
		
		// Mensagem final exibida quando o laço termina.
		System.out.println("Teste Finalizado!");
		
		// Fecha o objeto Scanner para liberar recursos.
		sc.close();
	}
}