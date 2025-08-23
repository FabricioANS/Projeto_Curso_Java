import java.util.Scanner; // Importa a classe Scanner para entrada de dados (não usada neste exemplo, mas boa prática).

// Define a classe principal do programa.
public class aula7_Cond_Etaria {
	
	// Método principal, onde a execução do programa começa.
	public static void main(String[] args) {
		
		// Cria um objeto Scanner para ler dados (não utilizado para leitura aqui).
		Scanner sc = new Scanner(System.in);
		
		// Declara e inicializa a variável 'preco' com 34.5.
		double preco = 34.5;
		// Calcula o desconto usando o operador ternário:
		// Se 'preco' for menor que 20.0, o desconto é 10% de 'preco'.
		// Caso contrário (se 'preco' for 20.0 ou mais), o desconto é 5% de 'preco'.
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		// Imprime o valor do 'desconto' calculado.
		System.out.println(desconto);
		
		// Fecha o objeto Scanner para liberar recursos.
		sc.close();

	}
}