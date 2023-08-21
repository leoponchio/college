import java.util.Scanner;

    public class vetor {
        public static void main(String[] args) {
            Scanner ler  = new Scanner (System.in);
            int tamanho = 5;
            Double[] notas = new Double[tamanho];

            for (int i = 0; i < notas.length; i++) {
                System.out.print("escreva as notas: ");
                notas[i] = ler.nextDouble();
            }

            for (int i = 0; i < notas.length; i++) {
                System.out.print("notas: " + notas[i]);
            }
        }
    }