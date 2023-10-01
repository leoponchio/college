public class matrizSelection {

    public static void random(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 25);
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

    public static int encontrarMenor(int[][] matriz) {
        int menorElemento = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menorElemento) {
                    menorElemento = matriz[i][j];                  
                }
            }
        }
        return menorElemento;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        random(matriz);
        System.out.println("original: ");
        imprimirMatriz(matriz);

        int menorElemento = encontrarMenor(matriz);
        System.out.println("menor elemento: " + menorElemento);

        }
}