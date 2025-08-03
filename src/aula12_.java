// Importa a classe Scanner para ler dados do teclado
import java.util.Scanner;

// Declara a classe principal
public class aula12_ {
	
    // Método principal: ponto de entrada do programa
	public static void main(String[] args) {
		
        // Cria um objeto Scanner para capturar entrada do usuário via teclado
		Scanner sc = new Scanner(System.in);
		
        // Solicita ao usuário que insira três números inteiros
		System.out.println("Enter Three numbers: ");
		
        // Lê os três números digitados pelo usuário e armazena nas variáveis 'a', 'b' e 'c'
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
        // Chama o método 'max' passando os três números e armazena o maior em 'higher'
		int higher = max(a, b, c);
		
        // Chama o método para exibir o resultado na tela
		showResult(higher);
				
        // Fecha o Scanner para liberar os recursos do sistema
		sc.close();
	}

    // Método que retorna o maior valor entre três inteiros
	public static int max(int x, int y, int z) {
		
        int aux; // Variável auxiliar que armazenará o maior valor
		
        // Verifica se x é o maior
		if (x > y && x > z) {
			aux = x;
		}
        // Se x não for o maior, verifica se y é maior que z
		else if (y > z) {
			aux = y;
		}
        // Se nenhuma das condições acima for verdadeira, então z é o maior
		else {
			aux = z;
		}
        // Retorna o maior valor encontrado
		return aux;
	}
	
    // Método que exibe o maior valor encontrado
	public static void showResult(int value) {
		System.out.println("Higher: " + value);
	}
}
