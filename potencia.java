import java.util.Scanner;

    public class potencia {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int base, expoente;

            System.out.print("escreva o valor da base: ");
            base = ler.nextInt();

            System.out.print("escreva o valor do expoente: ");
            expoente = ler.nextInt();

            int resultado = calcPotencia(base, expoente);
            System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);
        }

        public static int calcPotencia(int base, int expoente) {
            int resultado = 1;
            for(int i = 0; i < expoente; i++) {
                resultado *= base;
            }
            return resultado;
        }
}
