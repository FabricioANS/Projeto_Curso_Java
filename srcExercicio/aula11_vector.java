// Classe principal do programa
public class aula11_vector {

    // Método main - ponto de entrada da execução do programa
    public static void main(String[] args) {

        // Declara e inicializa uma string com três palavras separadas por espaços
        String s = "potato apple lemon ";

        // O método split(" ") separa a string em partes, usando o espaço (" ") como delimitador
        // Cada palavra é colocada como um elemento em um vetor de Strings
        String[] vect = s.split(" ");   // Resultado: ["potato", "apple", "lemon", ""]

        // Imprime o primeiro elemento do vetor (índice 0), que é "potato"
        System.out.println(vect[0]);

        // Imprime o segundo elemento do vetor (índice 1), que é "apple"
        System.out.println(vect[1]);

        // Imprime o terceiro elemento do vetor (índice 2), que é "lemon"
        System.out.println(vect[2]);

        // Obs: se a string original terminar com espaço (como no exemplo),
        // o último elemento do vetor pode ser uma string vazia (""), dependendo da posição.
    }
}
