public class matrizInd {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        matrizRec(matriz, 0, 0);
    }

    public static void matrizRec(int[][] matriz, int linha, int coluna) {
        if (linha == matriz.length) {
            return;
        }

        if (coluna == matriz[linha].length) {
            matrizRec(matriz, linha + 1, 0);
            return;
        }

        System.out.println("posição " + linha + coluna + matriz[linha][coluna]);
        matrizRec(matriz, linha, coluna + 1);
    }
}
