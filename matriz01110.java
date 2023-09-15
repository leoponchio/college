public class matriz01110 {
    public static void main(String[] args) {
        int matriz[][] = new int [5][5];

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                matriz[i][j] = 1;
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