// Classe principal do programa
public class aula10_ {

    // Método principal: ponto de entrada da execução do programa
    public static void main(String[] args) {

        // Declara uma string chamada "original" com espaços no final e diferentes letras maiúsculas e minúsculas
        String original = "abcde FGHIJ ABC abc DEFG      ";

        // Transforma todos os caracteres da string original em letras minúsculas
        String s01 = original.toLowerCase();

        // Transforma todos os caracteres da string original em letras maiúsculas
        String s02 = original.toUpperCase();

        // Remove os espaços em branco do início e do final da string (não remove espaços internos)
        String s03 = original.trim();

        // Cria uma nova string a partir do índice 2 até o final (contagem começa do zero)
        String s04 = original.substring(2);

        // Cria uma nova string a partir do índice 2 até o índice 9 (o índice 9 **não é incluído**)
        String s05 = original.substring(2, 9);

        // Substitui todas as ocorrências do caractere 'a' por 'x'
        String s06 = original.replace('a', 'x');

        // Substitui todas as ocorrências da sequência "abc" por "xy"
        String s07 = original.replace("abc", "xy");

        // Impressão das strings com delimitadores "-" para visualizar os espaços e alterações
        System.out.println("Original: -" + original + "-");

        System.out.println("toLowerCase: -" + s01 + "-");  // Imprime a string toda em letras minúsculas

        System.out.println("toUpperCase: -" + s02 + "-");  // Imprime a string toda em letras maiúsculas

        System.out.println("trim: -" + s03 + "-");          // Imprime a string sem espaços no início e no fim

        System.out.println("Substring(2): -" + s04 + "-");  // Imprime a string a partir do índice 2

        System.out.println("Substring(2, 9): -" + s05 + "-"); // Imprime os caracteres do índice 2 até o 8

        System.out.println("Replace 'a' -> 'x': -" + s06 + "-"); // Imprime a string substituindo o caractere 'a' por 'x'

        System.out.println("Replace \"abc\" -> \"xy\": -" + s07 + "-"); // Substitui o texto "abc" por "xy"
    }
}
