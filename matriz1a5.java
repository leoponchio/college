public class matriz1a5 {
    public static void main(String[] args) {
        int matriz[][] = new int [5][5];

       for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    matriz[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    matriz[i][j] = 5 - j;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
