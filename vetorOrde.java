import java.util.Scanner;

    public class vetorOrde {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int tamanho;

            System.out.print("escreva o tamanho do seu vetor: ");
            tamanho = ler.nextInt();

            int[] vetor = new int[tamanho];
            System.out.print("escreva os valores do vetor: ");
            for (int i = 0; i < tamanho; i++) {
                vetor[i] = ler.nextInt();
            }

            vetorInd(vetor, 0);
            }
    }

     public static void vetorInd(int[] vetor, int indice) {
        if (indice == vetor.length) {
            return;
        }

        System.out.println("indice " + indice + ": " + vetor[indice]);
        vetorInd(vetor, indice + 1);
    }
}
