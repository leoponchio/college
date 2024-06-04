import java.util.Scanner;

public class palindromo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;

        System.out.print("escreva uma palavra para verificar se é um palindromo: ");
        palavra = ler.nextLine();

        verifPalindromo(palavra);
    }

    public static void verifPalindromo(String palavra) {
        String textoInvertido = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(textoInvertido)) {
            System.out.println(palavra + " é um palindromo");
        } else {
            System.out.println(palavra + " não é um palindromo");
        }
    }
}
