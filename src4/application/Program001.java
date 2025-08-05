package application;

// Declara a classe principal do programa
public class Program001 {
	
	// Método principal de execução do programa
	public static void main (String[] args) {
		
		// Declara e inicializa um array de strings com 3 nomes
		String[] vect = new String[] {"maria", "bob", "Alex"};
		
		// Loop 'for' tradicional para percorrer e imprimir cada elemento do array
		// O loop itera de 0 até o tamanho total do array
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]); // Imprime o elemento na posição 'i'
				
		}
		
		// Imprime uma linha para separar as saídas dos loops
		System.out.println("____________");
		
		// Loop 'for-each' (ou for aprimorado) para percorrer o array
		// Este loop é mais simples e não necessita de um índice
		for (String obj : vect) {
			System.out.println(obj); // Imprime cada elemento do array
		}
			
	}
}