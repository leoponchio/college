import java.util.Scanner;

    public class nota {
        public static void main(String []args) {
            Scanner ler = new Scanner(System.in);

            int tamanho = 10;
            double[] notas = new double[tamanho];

            for (int i = 0; i < notas.length; i++) {
                System.out.print("digite sua " + i + " nota: ");
                notas[i] = ler.nextDouble();
            }

            for (int i = 0; i < notas.length; i++) {
                System.out.print("NOTA " + i + ": " + notas[i]);
            }
        }
    }