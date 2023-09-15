import java.util.Scanner;

public class calcPotencia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int base;
        int expoente;

        System.out.print("digite o valor da sua base: ");
        base = ler.nextInt();

        System.out.print("digite o valor do seu expoente: ");
        expoente = ler.nextInt();

        calcularPotencia(base, expoente);
    }

    public static void calcularPotencia(int base, int expoente) {

    double elevado = Math.pow(base, expoente);
     System.out.println("resultado: " + elevado);
    }
}