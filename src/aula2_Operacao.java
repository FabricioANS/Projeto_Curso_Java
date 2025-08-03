// Declaração da classe principal do programa
public class aula2_Operacao {

    // Método main: ponto de entrada do programa
	public static void main(String[] args) {
		
        // Declara duas variáveis inteiras: 'a' e 'b'
		int a, b;

        // Declara uma variável do tipo double para armazenar o resultado da divisão
		double resultado;
		
        // Atribui valores às variáveis 'a' e 'b'
		a = 5;
		b = 2;
		
        // Realiza a divisão com casting explícito (conversão de 'a' para double)
        // Isso garante que o resultado da divisão será um número decimal (double),
        // e não uma divisão inteira que descartaria os decimais.
		resultado = (double)a / b;  // Resultado: 5.0 / 2 = 2.5
		
        // Exibe o resultado da divisão na tela
		System.out.println(resultado);
	}
}
