public class newvetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = (int) (Math.random() * 11); 
        }

        int[] novoVetor = new int[vetor.length / 2];
        for (int i = 0; i < novoVetor.length; i++) {
            novoVetor[i] = vetor[2 * i] + vetor[2 * i + 1];
        }

        System.out.print("vetor original: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.print("\nnovo vetor: ");
        for (int num : novoVetor) {
            System.out.print(num + " ");
        }
    }
}