public class somaslinha {
    public static void main (String[] args) {
        int[][] matriz = new int[5][3];

        for (int i = 0; i < 5; i++) {
            int somalinha = 0;
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int)(Math.random() * 15);
                somalinha += matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("= soma: " + somalinha);
        }
    }
}