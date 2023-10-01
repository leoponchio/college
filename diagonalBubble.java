public class diagonalBubble {

    public static void random(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 20);
            }
        }
    }

    public static void ordenarDiagonal(int[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (matriz[j][j] > matriz[j + 1][j + 1]) {
                    int temp = matriz[j][j];
                    matriz[j][j] = matriz[j + 1][j + 1];
                    matriz[j + 1][j + 1] = temp;
                }
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

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        random(matriz);
        System.out.println("original: ");
        imprimirMatriz(matriz);

        ordenarDiagonal(matriz);
        System.out.println("diagonal ordenada: " );
        imprimirMatriz(matriz);

    }
}