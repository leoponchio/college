public class matriz013 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int matriz[][] = new int [5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || j == 4 - i) {
                matriz[i][j] = 0;
                }
                else if (i == 2 || j == 2) {
                matriz[i][j] = 3;
                } 
                else {
                    matriz[i][j] = 1;
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