import java.util.Scanner;

public class potenRec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, expoente, soma;

        System.out.print("escreva o valor da base: ");
        base = scanner.nextInt();

        System.out.print("escreva o valor do expoente: ");
        expoente = scanner.nextInt();

        soma = calcularPotencia(base, expoente);
        System.out.println(base + "^" + expoente + " = " + soma);

        scanner.close();
    }

    public static int calcularPotencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        else {
            return base * calcularPotencia(base, expoente - 1);
        }
    }
}
