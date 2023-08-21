public class mediapar {
    public static void main(String[] args) {
        int[] vetor = new int[16];

        for (int i = 0; i < 16; i++) {
            vetor[i] = i + 1;
        }

        int soma = 0;
        int cont = 0;
        for (int i = 0; i < 16; i += 2) {
            soma += vetor[i];
            cont++;
        }

        double media = (double) soma / cont;

        System.out.println("Vetor:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println("media dos valores pares: " + media);
    }
}





