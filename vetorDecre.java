import java.util.Scanner;

public class vetorDecre {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("escreva o tamanho do vetor: ");
        int tamanho = ler.nextInt();

        int[] vetor = new int[tamanho];
        System.out.println("escreva os valores do vetor: ");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = ler.nextInt();
        }

        indDecre(vetor, tamanho - 1);
    }

    public static void indDecre(int[] vetor, int indice) {
        if (indice < 0) {
            return;
        }

        System.out.println("indice " + indice + ": " + vetor[indice]);
        indDecre(vetor, indice - 1);
    }
}
