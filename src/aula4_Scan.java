// Importa a classe Scanner do pacote java.util.
// Esta classe é essencial para ler a entrada de dados do usuário,
// como o que é digitado no teclado.
import java.util.Scanner;

// Declaração da classe principal do programa.
// O nome da classe (aula4_Scan) deve corresponder ao nome do arquivo .java.
public class aula4_Scan {

	// O método 'main' é o ponto de entrada de qualquer aplicação Java.
	// Quando você executa o programa, a Java Virtual Machine (JVM)
	// começa a execução a partir deste método.
	public static void main(String[] args) {

		// Cria uma instância (objeto) da classe Scanner.
		// 'sc' é a variável que usaremos para interagir com o Scanner.
		// 'System.in' indica que o Scanner deve ler dados da entrada padrão,
		// que é tipicamente o teclado do usuário.
		Scanner sc = new Scanner(System.in);
		
		// ------------------- DECLARAÇÃO DE VARIÁVEIS STRING -------------------
		
		// Declara três variáveis do tipo String, que serão usadas para armazenar texto.
		// 's1', 's2' e 's3' são os nomes das variáveis.
		String s1, s2, s3;
		
		// ------------------- LEITURA DE LINHAS INTEIRAS -------------------
		
		// sc.nextLine() lê a linha inteira digitada pelo usuário,
		// incluindo os espaços em branco, até encontrar o caractere de "quebra de linha" (Enter).
		// O caractere de quebra de linha é consumido, mas não é armazenado na string.
		// O texto lido é atribuído à variável s1.
		s1 = sc.nextLine(); 
		
		// Lê a segunda linha inteira digitada pelo usuário e armazena na variável s2.
		// Novamente, consome a linha completa até o Enter.
		s2 = sc.nextLine();
		
		// Lê a terceira linha inteira digitada pelo usuário e armazena na variável s3.
		// Esta é a mesma funcionalidade de sc.nextLine() repetida.
		s3 = sc.nextLine();
		
		// ------------------- EXIBIÇÃO DOS DADOS DIGITADOS -------------------
		
		// Imprime no console uma mensagem de cabeçalho.
		// O 'println' adiciona uma quebra de linha no final, movendo o cursor para a próxima linha.
		System.out.println("Dados Digitados: ");
		
		// Imprime o conteúdo da variável s1 no console.
		// Cada 'println' exibirá o texto em uma nova linha.
		System.out.println(s1);
		
		// Imprime o conteúdo da variável s2 no console.
		System.out.println(s2);
		
		// Imprime o conteúdo da variável s3 no console.
		System.out.println(s3);
		
		// ------------------- FECHAMENTO DO SCANNER -------------------
		// É uma boa prática fechar o objeto Scanner quando ele não for mais necessário.
		// Isso libera os recursos do sistema associados a ele, evitando possíveis vazamentos
		// de recursos ou erros em programas mais complexos e de longa duração.
		sc.close();
	}

}