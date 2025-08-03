// Importa a classe Locale para configurar o padrão regional de formatação numérica
import java.util.Locale;

// Importa a classe Scanner para entrada de dados via teclado
import java.util.Scanner;

// Classe principal
public class aula13_ {
	
	public static void main(String[] args) {
		
		// Define a localidade para os EUA (ponto como separador decimal)
		Locale.setDefault(Locale.US);

		// Cria um objeto Scanner para ler dados do teclado
		Scanner sc = new Scanner(System.in);

		// Declaração das variáveis para armazenar as medidas dos dois triângulos
		double xA, xB, xC; // Lados do triângulo X
		double yA, yB, yC; // Lados do triângulo Y
		
		// Solicita ao usuário as medidas do triângulo X
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		// Solicita ao usuário as medidas do triângulo Y
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		// Cálculo da área do triângulo X usando a fórmula de Heron
		// Primeiro calcula o semiperímetro (metade da soma dos lados)
		double p = (xA + xB + xC) / 2;

		// Aplica a fórmula de Heron: sqrt(p(p-a)(p-b)(p-c))
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		// Cálculo da área do triângulo Y
		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		// Exibe as áreas com 4 casas decimais
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		// Compara as áreas e exibe qual triângulo tem a maior área
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		// Fecha o Scanner para liberar recursos do sistema
		sc.close();
	}
}
