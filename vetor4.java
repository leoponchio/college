import java.util.Scanner;

    public class vetor4 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int vetor[] = new int[10];

            for (int i = 0; i < vetor.length; i++) {
                System.out.print("digite uma posição: ");
                vetor[i] = ler.nextInt();
            }
            for (int i = vetor.length - 1; i >= 0; i--){
                System.out.println("as posições em ordem inversa é: " + vetor[i]);

            }
        }
    }