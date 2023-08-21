public class questao4B {
    public static void main(String[] args) {
        int[][] matriz = new int [5][10];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = j * j;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}