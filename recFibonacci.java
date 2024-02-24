import java.util.Scanner;

    public class recFibonacci {

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
        int valor;
        int fibonacci;

            System.out.print("digite um valor inteiro: ");
            valor = ler.nextInt();
            fibonacci = calcFibo(valor);

        System.out.println("o " + valor + " numero da sequencia de Fibonacci é: " + fibonacci);
        }

        public static int calcFibo(int valor) {
        if (valor <= 1) {
            return valor;
        } else {
            return calcFibo(valor - 1) + calcFibo(valor - 2);
        }
    }
}
