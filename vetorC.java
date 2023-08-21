import java.util.Scanner;

    public class vetorC {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int vetorA[] = new int[10];
            int vetorB[] = new int[10];
            int vetorC[] = new int[20];

            for (int i = 0; i < vetorA.length; i++) {
                System.out.print("digite o valor do vetor A: ");
                vetorA[i] = ler.nextInt();
                vetorC[i] = vetorA[i];
            }

            for (int i = 0; i < vetorB.length; i++) {
                System.out.print("digite o valor do vetor B: ");
                vetorB[i] = ler.nextInt();
                vetorC[i + 10] = vetorB[i];
            }

            for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
            }
        }
    }