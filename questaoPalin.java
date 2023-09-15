import java.util.Scanner;

public class questaoPalin {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;

        System.out.println("escreva uma palavra aleatoria: ");
        palavra = ler.nextLine();

        boolean palindromo = verificarPalindromo(palavra);

        if (palindromo) {
            System.out.println(palavra + " é um palindromo");
        } else {
            System.out.println(palavra + " não é um palindromo");
        }
    }

    public static boolean verificarPalindromo(String palavra) {

        String invertida = new StringBuilder(palavra).reverse().toString();

        return palavra.equals(invertida);
    }
}