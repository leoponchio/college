import java.util.Scanner;

    public class fibonacci {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int n;

            System.out.print("escreva um numero inteiro: ");
            n = ler.nextInt();

            int fibonacci = calcFibonacci(n);

            System.out.println("o " + n + "º termo da sequencia de fibonacci é: " + fibonacci);
        }

        public static int calcFibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return calcFibonacci(n - 1) + calcFibonacci(n - 2);
            }
        }
}
