import java.util.Random;

public class OrdenarColunasMatriz {
    
    public static void random(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 20);
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[lin].length; col++) {
                System.out.printf(" " + matriz[lin][col]);
            }
            System.out.println();
        }
    }

    public static void insertionSort(int[] coluna) {
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

    public static void ordenarColunasMatriz(int[][] matriz) {
        for (int col = 0; col < matriz[0].length; col++) {
            int[] coluna = new int[matriz.length];
            for (int lin = 0; lin < matriz.length; lin++) {
                coluna[lin] = matriz[lin][col];
            }
            insertionSort(coluna);
            for (int lin = 0; lin < matriz.length; lin++) {
                matriz[lin][col] = coluna[lin];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        random(matriz);

        System.out.println("Original:");
        imprimirMatriz(matriz);

        ordenarColunasMatriz(matriz);

        System.out.println("\nOrdenada:");
        imprimirMatriz(matriz);
    }
}
