// Importa a classe Scanner do pacote java.util.
// A classe Scanner é utilizada para obter entrada de dados de fontes como o teclado (System.in).
import java.util.Scanner; 

// Declaração da classe principal do programa.
// O nome da classe deve ser o mesmo do arquivo .java (aula3_Scan.java).
public class aula3_Scan {
	
	// Método principal (main). Este é o ponto de entrada do programa Java.
	// Quando o programa é executado, a JVM (Java Virtual Machine) procura e executa este método.
	public static void main(String[] args) {
	
		// Cria um objeto da classe Scanner.
		// 'sc' é o nome da nossa variável Scanner.
		// 'new Scanner(System.in)' cria uma nova instância de Scanner que lerá dados do "System.in",
		// que representa a entrada padrão do sistema (geralmente o teclado).
		Scanner sc = new Scanner(System.in);
		
		// ------------------- LEITURA DE NÚMERO INTEIRO -------------------
		
		// Declara uma variável inteira chamada 'x'.
		int x;
		// Lê o próximo token (sequência de caracteres separada por espaços, quebras de linha, etc.) da entrada
		// e tenta interpretá-lo como um número inteiro.
		// O valor lido é então atribuído à variável 'x'.
		x = sc.nextInt(); // Lê e armazena um número inteiro digitado pelo usuário.
		
		// Imprime no console a mensagem "Você digitou: " seguida do valor da variável 'x'.
		System.out.println("Você digitou: " + x);
		
		// ------------------- LEITURA DE STRING (UMA PALAVRA) -------------------
		
		// Declara uma variável do tipo String (para armazenar texto) chamada 'y'.
		String y;
		// Lê o próximo token da entrada como uma String.
		// Isso significa que ele lê uma sequência de caracteres até encontrar um delimitador (como espaço, tab, quebra de linha).
		// O valor lido é então atribuído à variável 'y'.
		y = sc.next(); // Lê e armazena uma única palavra (String) digitada pelo usuário.
		
		// Imprime no console a mensagem "Você digitou: " seguida do valor da variável 'y'.
		System.out.println("Você digitou: " + y);
		
		// ------------------- LEITURA DE NÚMERO COM PONTO FLUTUANTE -------------------
		
		// Declara uma variável do tipo double (para armazenar números com casas decimais) chamada 'z'.
		double z;
		// Lê o próximo token da entrada e tenta interpretá-lo como um número de ponto flutuante (double).
		// O valor lido é então atribuído à variável 'z'.
		// No Brasil, o separador decimal geralmente é a vírgula (,), mas o Scanner em Java (por padrão) espera um ponto (.).
		// Para que o Scanner aceite vírgula como separador decimal, seria necessário configurar a localidade.
		z = sc.nextDouble(); // Lê e armazena um número decimal (ponto flutuante) digitado pelo usuário.
		
		// Imprime no console a mensagem "Você digitou: " seguida do valor da variável 'z'.
		System.out.println("Você digitou: " + z);
		
		// ------------------- LEITURA DE CARACTERE (PRIMEIRA LETRA) -------------------
		
		// Declara uma variável do tipo char (para armazenar um único caractere) chamada 'n'.
		char n;
		// 'sc.next()' lê a próxima palavra (String) da entrada.
		// '.charAt(0)' é um método da classe String que retorna o caractere na posição 0 (o primeiro caractere)
		// da String lida.
		// Assim, esta linha lê uma palavra e pega apenas a primeira letra dela.
		n = sc.next().charAt(0); // Lê a primeira letra da próxima palavra digitada pelo usuário.
		
		// Imprime no console a mensagem "Você digitou: " seguida do valor da variável 'n'.
		System.out.println("Você digitou: " + n);
		
		// ------------------- FECHAMENTO DO SCANNER -------------------
		
		// Fecha o objeto Scanner.
		// É uma boa prática fechar recursos como o Scanner para liberar recursos do sistema
		// e evitar vazamentos de memória ou outros problemas, especialmente em programas maiores.
		sc.close();
	}

}