public class menormaior {
    public static void main (String[] args) {
        int[][] matriz = new int[5][6];
        int linhamin = 0;
        int colunamin = 0;
        int linhamax = 0;
        int colunamax = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = (int)(Math.random() * 30);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int valormax = matriz[0][0];
        int valormin = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < valormin) {
                    valormin = matriz[i][j];
                    linhamin = i;
                    colunamin = j;
                }
                if (matriz[i][j] > valormax) {
                    valormax = matriz[i][j];
                    linhamax = i;
                    colunamax = j;
                }
            }
        }
        System.out.println("menor valor: " + valormin + ", " + " posição: " + linhamin + " x " + colunamin);
        System.out.println("maior valor: " + valormax + ", " + " posição: " + linhamax + " x " + colunamax);

    }
}