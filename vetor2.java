import java.util.Scanner;

    public class vetor2 {
        public static void main (String[] args) {
            Scanner ler = new Scanner(System.in);

            int tamanho = 5;
            int valor[] = new int[tamanho];

            for (int i = 0; i < valor.length; i++) {
                System.out.print("digite o valor: ");
                valor[i] = ler.nextInt();
            }

            System.out.print("primeiro elemento: " + valor[0]);
            System.out.print("ultimo elemento: " + valor[valor.length - 1]);
        }
    }