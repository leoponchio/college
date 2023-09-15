public class mediaDiag {
    public static void main(String[] args) {
        int matriz[][] = new int [6][6];
        int soma = 0;
        double media = 0;
        int cont = 0;

        System.out.println("matriz original: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = (int)(Math.random() * 10);
                if (i == j || j == 5 - i) {
                    soma += matriz[i][j];
                    cont++;
                } 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        media = soma / 12;
        System.out.print("media da diagonal principal e secundaria: " + media);
    }
}