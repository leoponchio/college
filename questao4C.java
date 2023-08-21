public class questao4C {
    public static void main(String[] args) {
        int[][] matriz = new int [5][10];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = (i % 2 == 0) ? 1 : 2;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}