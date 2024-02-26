import java.util.Scanner;

public class recTribonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;

        System.out.print("digite uma valor inteiro: ");
        valor = ler.nextInt();

        int result = calcTrib(valor);
        System.out.print("resultado tribonacci: " + result);
    }
    public static int calcTrib (int valor) {
        if (valor <= 0|| valor == 1) {
            return 0;
        } else if (valor == 2) {
                return 1;
        } else {
            return calcTrib(valor - 1) + calcTrib(valor - 2) + calcTrib(valor - 3);
        }
    }
}
