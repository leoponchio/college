import java.util.Scanner;

public class somaTudo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho;

        System.out.print("escreva o tamanho do vetor: ");
        tamanho = ler.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("escreva os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = ler.nextInt();
        }

        int resultado = somaAll(vetor, 0);
        System.out.println("soma dos valores: " + resultado);


    }

    public static int somaAll(int[] vetor, int indice) {
        if (indice == vetor.length) {
            return 0;
        } else {
            return vetor[indice] + somaAll(vetor, indice + 1);
        }
    }
}
