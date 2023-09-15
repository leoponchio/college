public class matrizPar {
    public static void main(String[] args) {
        int matriz[][] = new int [8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = (int)(Math.random() * 10);
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}