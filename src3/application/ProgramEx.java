package application;

// Importa classes necessárias para o programa
import java.util.Locale; // Para definir o padrão de idioma
import java.util.Scanner; // Para ler a entrada do usuário

// Declara a classe principal do programa
public class ProgramEx {
	
	// Método principal de execução
	public static void main(String[] args) {
		
		// Define o idioma padrão para a localização, garantindo que números de ponto flutuante sejam lidos com ponto (.)
		Locale.setDefault(Locale.US); 
		// Cria um objeto Scanner para receber dados do teclado
		Scanner sc = new Scanner(System.in);
		
		// Solicita ao usuário o número de pessoas a serem cadastradas
		System.out.print("Quantas pessoas voce vai cadastrar? ");
		// Lê o número e armazena na variável 'n'
		int n = sc.nextInt();
		
		// Declara três arrays para armazenar os dados das pessoas
		// 'nome' para os nomes, 'idade' para as idades e 'altura' para as alturas
		String[] nome = new String[n];
		int [] idade = new int[n];
		double[] altura = new double[n];
		
		// Loop 'for' para ler os dados de cada pessoa
		for (int i=0; i<n; i++) {
			// Solicita os dados da pessoa atual
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			// Lê e armazena o nome
			System.out.print("Nome: ");
			sc.nextLine(); // Consome a quebra de linha pendente do nextInt()
			nome[i] = sc.nextLine();
			// Lê e armazena a idade
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			// Lê e armazena a altura
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		// Inicializa uma variável para somar as alturas
		double soma = 0.0;
		// Loop para somar todas as alturas
		for (int i=0; i<n; i++) {
			soma = soma + altura[i];
		}
		// Calcula a altura média dividindo a soma pelo número de pessoas
		double mediaAltura = soma / n;
		System.out.println(); // Pula uma linha para formatar a saída
		// Imprime a altura média formatada com duas casas decimais
		System.out.printf("Altura media: %.2f%n", mediaAltura);
		
		// Inicializa um contador para pessoas com menos de 16 anos
		int cont = 0;
		// Loop para contar as pessoas com idade inferior a 16
		for (int i=0; i<n; i++) {
			if(idade[i] < 16) {
				cont = cont +1;
			}
		}
		
		// Calcula a porcentagem de pessoas com menos de 16 anos
		double percent = cont * 100.0 / n;
		// Imprime a porcentagem formatada com duas casas decimais e o símbolo de percentual
		System.out.printf("Pessoas com menos de 16 anos: %.2f %% %n ", percent );
		
		// Loop para imprimir os nomes das pessoas com menos de 16 anos
		for (int i=0; i<n; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		// Fecha o objeto Scanner para liberar os recursos do sistema
		sc.close();
	}
}
