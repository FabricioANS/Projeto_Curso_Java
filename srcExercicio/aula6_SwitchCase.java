
import java.util.Locale; // Importa a classe Locale para configurações regionais.
import java.util.Scanner; // Importa a classe Scanner para ler entrada do usuário.

// Define a classe principal do programa.
public class aula6_SwitchCase {
	
	// Método principal, onde a execução do programa começa.
	public static void main(String[] args) {
		
		// Define a localidade padrão como EUA para garantir o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US); 
		// Cria um objeto Scanner para ler dados do teclado.
		Scanner sc = new Scanner(System.in);
		
		// Lê um número inteiro digitado pelo usuário e armazena em 'x'.
		int x = sc.nextInt();
		// Declara uma variável String para armazenar o nome do dia da semana.
		String dia;
		
		// Inicia a estrutura switch-case para verificar o valor de 'x'.
		switch (x) {
			// Se 'x' for 1, atribui "Domingo" a 'dia'.
			case 1:
				dia = "Domingo";
				break; // Sai do switch.
			// Se 'x' for 2, atribui "Segunda" a 'dia'.
			case 2:
				dia = "Segunda";
				break;
			// E assim por diante para os outros dias da semana.
			case 3:
				dia = "Terça";
				break;
			case 4:
				dia = "Quarta";
				break;
			case 5:
				dia = "Quinta";
				break;
			case 6:
				dia = "Sexta";
				break;
			case 7:
				dia = "Sábado";
				break;
			// Se 'x' não corresponder a nenhum dos casos acima (1 a 7).
			default:
				dia = "Valor invalido"; // Atribui "Valor invalido" a 'dia'.
				break;
		}
		// Imprime o nome do dia da semana correspondente ou "Valor invalido".
		System.out.println("Dia da Semana:"+ dia);
		
		// Fecha o objeto Scanner para liberar recursos.
		sc.close();

	}
}