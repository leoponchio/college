import java.util.Scanner;

public class recPell {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;

        System.out.print("digite uma valor inteiro: ");
        valor = ler.nextInt();

        int result = calcPell(valor);
        System.out.print("resultado pell: " + result);
    }
    public static int calcPell (int valor) {
        if (valor <= 0|| valor == 1) {
            return 0;
        } else if (valor == 2) {
            return 1;
        } else {
            return 2 * calcPell(valor - 1) + calcPell(valor - 2);
        }
    }
}
