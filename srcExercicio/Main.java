// Define a classe principal do programa.
public class Main {

	// Método principal, onde a execução do programa começa.
	public static void main(String[] args) {
		
		// Declara e inicializa a variável inteira 'idade'.
		int idade = 31;
		// Declara e inicializa a variável double 'renda' (com casas decimais).
		double renda = 5000.00;
		// Declara e inicializa a variável String 'nome' (para texto).
		String nome = "Maria";
		
		// Imprime uma string formatada usando 'printf':
		// %s substitui pelo valor de 'nome' (String).
		// %d substitui pelo valor de 'idade' (int).
		// %.2f substitui pelo valor de 'renda' (double), formatado com 2 casas decimais.
		// %n insere uma nova linha.
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
	}

}