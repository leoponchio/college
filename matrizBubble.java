public class matrizBubble {
    
    public static void random(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(" " + matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean troca;

        for (int i = 0; i < n - 1; i++) {
            troca = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    troca = true;
                }
            }

            if (! troca) {
                break;
            }
        }
    }

    public static void ordenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            bubbleSort(matriz[i]);
        }
    }

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        random(matriz);

        System.out.println("Original:");
        imprimirMatriz(matriz);

        ordenarMatriz(matriz);

        System.out.println("\nOrdenado:");
        imprimirMatriz(matriz);
    }
}
