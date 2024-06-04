import java.util.Scanner;

public class impriVetor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho;

        System.out.print("escreva o tamanho do vetor: ");
        tamanho = ler.nextInt();

        int[] vetor = new int[tamanho];

        System.out.print("escreva os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = ler.nextInt();
        }

        vetorInt(vetor);
    }

    public static void vetorInt(int[] vetor) {
        System.out.print("valor do vetor inteiro: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
