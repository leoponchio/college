import java.util.Scanner;

public class tetração {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int base, altura;

        System.out.print("escreva a base (entre 1 e 7): ");
        base = ler.nextInt();

        System.out.print("escreva a altura (entre 2 e 4): ");
        altura = ler.nextInt();

        double resultado = calcTetracao(base, altura);

    }

    public static double calcTetracao(int base, int altura) {
        if (base < 1 || base > 7 || altura < 2 || altura > 4) {
            throw new IllegalArgumentException("valores da base deve estar entre 1 e 7, e altura entre 2 e 4");
        }

        double resultado = base;

        for (int i = 1; i < altura; i++) {
            resultado = Math.pow(base, resultado);
        }
        System.out.println("o resultado da tetração é: " + resultado);

        return resultado;
    }
}
