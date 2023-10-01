public class allOrd {

    public static void random(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 20);
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

    public static void linhaBubble(int[] vetor) {
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

    public static void colunaInsertion(int[] coluna) {
        for (int i = 1; i < coluna.length; i++) {
            int chave = coluna[i];
            int j = i - 1;
            while (j >= 0 && chave < coluna[j]) {
                coluna[j + 1] = coluna[j];
                j--;
            }
            coluna[j + 1] = chave;
        }
    }

    public static void diagonalSelection(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (matriz[j][j] < matriz[min][min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = matriz[i][i];
                matriz[i][i] = matriz[min][min];
                matriz[min][min] = temp;
            }
        }
    }

    public static void ordenarLinha(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            linhaBubble(matriz[i]);
        }
    }

    public static void ordenarColuna(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            int[] coluna = new int[matriz.length];
            for (int i = 0; i < matriz.length; i++) {
                coluna[i] = matriz[i][j];
            }
            colunaInsertion(coluna);
            for (int i = 0; i < matriz.length; i++) {
                matriz[i][j] = coluna[i];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        random(matriz);

        System.out.println("original: ");
        imprimirMatriz(matriz);

        ordenarLinha(matriz);
        System.out.println("linha ordenada: ");
        imprimirMatriz(matriz);

        ordenarColuna(matriz);
        System.out.println("coluna ordenada: ");
        imprimirMatriz(matriz);

        diagonalSelection(matriz);
        System.out.println("diagonal ordenada: " );
        imprimirMatriz(matriz);
    }
}