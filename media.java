import java.util.Scanner;

    public class media {
        public static void main(String []args) {
            Scanner ler = new Scanner (System.in);
            double[] notas = new double[10];
            double media = 0;

            for (int i = 0; i < notas.length; i++) {
                System.out.print("digite sua " + i + " nota: ");
                notas[i] = ler.nextDouble();
                media += notas[i];
            }
            media /= notas.length;
            System.out.println("A media final é: " + media);
        }
    }