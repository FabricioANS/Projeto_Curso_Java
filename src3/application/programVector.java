package application;

// Importa as classes necessárias para o programa
import java.util.Locale; // Usado para definir o padrão de idioma
import java.util.Scanner; // Usado para ler a entrada do usuário

// Declara a classe principal do programa
public class programVector {
	
	// Método principal que inicia a execução
	public static void main(String[] args) {
		
		// Define o idioma padrão para US, garantindo que o separador decimal seja um ponto
		Locale.setDefault(Locale.US);
		// Cria um objeto Scanner para receber dados do teclado
		Scanner sc = new Scanner(System.in);
		
		// Solicita ao usuário a quantidade de números que serão digitados
		System.out.print("Quantos numeros voce vai digitar? ");
		// Lê a quantidade e armazena na variável 'n'
		int n = sc.nextInt();
		
		// Declara um array de inteiros com o tamanho 'n'
		int[] vet = new int[n];
		
		// Loop 'for' para ler os números e preencher o array
		for (int i=0; i<n; i++) {
			// Solicita ao usuário que digite um número
			System.out.print("Digite um numero: ");
			// Lê o número e armazena na posição 'i' do array
			vet[i] = sc.nextInt();
			
		}
		
		// Imprime um cabeçalho para a lista de números negativos
		System.out.println("Numeros negativos: ");
		
		// Loop 'for' para percorrer o array e verificar cada número
		for (int i=0; i<n; i++) {
			// Verifica se o número na posição 'i' é menor que zero
			if (vet[i] <0) {
				// Se for negativo, imprime o número
				System.out.println(vet[i]);
			}	
		}
		
		// Fecha o objeto Scanner para liberar os recursos
		sc.close();
	}
}