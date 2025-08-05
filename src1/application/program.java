package application;

// Importa as classes necessárias para o programa
import java.util.Locale; // Usado para definir o padrão de idioma
import java.util.Scanner; // Usado para ler a entrada do usuário

// Declara a classe principal do programa
public class program {
	
	// Método principal que inicia a execução
	public static void main(String [] args) {
	
		// Define o idioma padrão para US, garantindo que o separador decimal seja um ponto
		Locale.setDefault(Locale.US);
		// Cria um objeto Scanner para receber dados do teclado
		Scanner sc = new Scanner(System.in);
	
		// Lê a quantidade de números que o usuário irá digitar e armazena em 'n'
		int n = sc.nextInt();
		// Declara e inicializa um array de doubles com o tamanho 'n'
		double[] vect = new double [n];
		
		// Loop 'for' para preencher o array com os números digitados
		for (int i=0; i<n; i++) {
			// Lê um número double e armazena na posição 'i' do array
			vect[i] = sc.nextDouble();
		}
		
		// Inicializa uma variável para somar os valores do array
		double sum = 0.0;
		// Loop 'for' para somar todos os valores do array
		for (int i=0; i<n; i++) {
			sum += vect[i]; // Adiciona o valor atual à soma
			
		}
		
		// Calcula a média dividindo a soma pelo número de elementos
		double avg = sum / n;
		
		// Imprime a média formatada com duas casas decimais
		System.out.printf("Media é: %.2f%n", avg);
		
	    // Fecha o objeto Scanner para liberar os recursos
	    sc.close();
	}

}