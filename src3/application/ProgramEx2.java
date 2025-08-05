package application;

// Importa as classes necessárias para o programa
import java.util.Locale; // Usado para definir o padrão de idioma
import java.util.Scanner; // Usado para ler a entrada do usuário

import entities.Rent; // Importa a classe 'Rent' do pacote 'entities'

// Declara a classe principal do programa
public class ProgramEx2 {
	
	// Método principal que inicia a execução
	public static void main(String[] args) {
		
		// Define o idioma padrão para US, garantindo que o separador decimal seja um ponto
		Locale.setDefault(Locale.US);
		// Cria um objeto Scanner para receber dados do teclado
		Scanner sc = new Scanner(System.in);
		
		// Declara um array de 10 posições para objetos do tipo Rent.
		// Cada posição representa um quarto (de 0 a 9)
		Rent[] vect = new Rent[10];
		
		// Pergunta ao usuário quantos quartos serão alugados
		System.out.print("How many rooms will be rented? ");
		// Lê a quantidade e armazena na variável 'n'
		int n = sc.nextInt();
		
		// Loop 'for' para cadastrar os aluguéis. Ele executa 'n' vezes.
		// O loop começa em 1 para uma melhor experiência de usuário ao exibir a contagem
		for (int i=1; i<=n; i++) {
			System.out.println(); // Pula uma linha para formatar a saída
			System.out.println("Rent #" +i+ ":"); // Exibe o número do aluguel atual
			System.out.print("Name: ");
			sc.nextLine(); // Consome a quebra de linha pendente após o nextInt()
			String name = sc.nextLine(); // Lê o nome completo do hóspede
			System.out.print("Email: ");
			String email = sc.next(); // Lê o e-mail do hóspede
			System.out.print("Room: ");
			int roomNumber = sc.nextInt(); // Lê o número do quarto
			
			// Cria um novo objeto Rent com o nome e e-mail e o armazena na posição do array correspondente ao número do quarto
			vect [roomNumber]= new Rent(name, email);
		}
		
		System.out.println(); // Pula uma linha
		System.out.println("Busy rooms:"); // Título para a lista de quartos ocupados
		
		// Loop 'for' para percorrer todas as 10 posições do array
		for (int i=0; i<10; i++) {
			// Verifica se a posição do array não está vazia (nula)
			if (vect[i] != null) {
			// Se não for nula, imprime o número do quarto e os dados do hóspede (nome e e-mail)
			System.out.println(i+ ": "+ vect[i]);
			}
		}
		
		sc.close(); // Fecha o objeto Scanner para liberar os recursos
	}
}