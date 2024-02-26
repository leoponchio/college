import java.util.Scanner;

public class intBin {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;

        System.out.print("digite uma valor inteiro: ");
        valor = ler.nextInt();

        String result = convertBin(valor);
        System.out.print("resultado em valor binario: " + result);
    }
    public static String convertBin(int valor) {
        if (valor == 0) {
            return "0";
        } else {
            return convertBin(valor / 2) + (valor % 2);
        }
    }
}
