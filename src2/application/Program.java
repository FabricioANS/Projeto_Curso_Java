package application;

// Importa as classes necessárias para o programa
import java.util.Locale; // Para definir o padrão de idioma
import java.util.Scanner; // Para ler a entrada do usuário

import entities.Product;

// Declara a classe principal do programa
public class Program {
	
	// Método principal que inicia a execução
	public static void main(String[] args) {
		
		// Define o idioma padrão para US, garantindo o separador decimal como ponto
		Locale.setDefault(Locale.US);
		// Cria um objeto Scanner para receber dados do teclado
		Scanner sc = new Scanner(System.in);
		
		// Lê a quantidade de produtos que o usuário irá inserir e armazena na variável 'n'
		int n = sc.nextInt();
		// Cria um array de objetos do tipo 'Product' com o tamanho 'n'
		Product [] vect = new Product[n];
		
		// Loop 'for' para preencher o array com os dados dos produtos
		for (int i=0; i<n; i++) {
			sc.nextLine(); // Consome a quebra de linha pendente do nextInt()
			// Lê o nome do produto
			String name = sc.nextLine();
			// Lê o preço do produto
			double price = sc.nextDouble();
			// Cria um novo objeto 'Product' e o armazena na posição 'i' do array
			vect [i] = new Product(name, price);
			
		}
		
		// Inicializa uma variável para somar os preços
		double sum = 0.0;
		// Loop 'for' para somar os preços de todos os produtos no array
		for (int i=0; i<n; i++) {
			sum += vect[i].getPrice(); // Chama o método getPrice() de cada objeto para obter o valor
		}
		
		// Calcula a média dos preços
		double avg = sum / n;
		
		// Imprime a média dos preços formatada com duas casas decimais
		System.out.printf("Average price: %.2f%n", avg);
		
		// Fecha o objeto Scanner para liberar os recursos
		sc.close();
		
	}

}