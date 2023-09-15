public class Bfigura {
    public static void main(String[] args) {
        char matriz[][] = new char [4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               matriz[i][j] = ' ';
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                matriz[i][j] = '*';   
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}