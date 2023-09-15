public class questaoFibonacci {
    public static void main(String[] args) {
        int n = 10; 
        int resultado = calcularFibonacci(n);

        System.out.println("o 10 termo da sequencia de fibonacci é: " + resultado);
    }

    public static int calcularFibonacci(int n) {
        
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fibA = 0;
            int fibB = 1;
            int fibAtual = 0;

            for (int i = 2; i <= n; i++) {
                fibAtual = fibA + fibB;
                fibA = fibB;
                fibB = fibAtual;
            }

            return fibAtual;
        }
    }
}