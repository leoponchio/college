import java.util.Scanner;

public class primosEntre {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor1, valor2;

        System.out.print("escreva o valor do início do intervalo: ");
        valor1 = ler.nextInt();

        System.out.print("escreva o valor do fim do intervalo: ");
        valor2 = ler.nextInt();

        primosInter(valor1, valor2);

        ler.close();
    }

    public static void primosInter(int valor1, int valor2) {
        System.out.print("numeros primos no intervalo de " + valor1 + " a " + valor2 + ": ");
        boolean encontrado = false;
        for (int n = valor1; n <= valor2; n++) {
            if (ehPrimo(n)) {
                encontrado = true;
                System.out.print(n + " ");
            }
        }
        if (!encontrado) {
            System.out.println("nenhum numero primo encontrado");
        }
        System.out.println();
    }

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
