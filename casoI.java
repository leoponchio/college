public class casoI {
    public static void main(String[] args) {
        int matriz[][] = new int [10] [10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                if (i < j) {
                    matriz[i][j] = 2 * i + 7 * j - 2;
                }
                if (i == j) {
                    matriz[i][j] = 3 * i * i * i - 1;
                }  
                if (i > j) {
                    matriz[i][j] = 4 * i * i + 5 * j * j + 1;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}