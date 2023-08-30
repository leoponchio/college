public class multiMatriz {
    public static void main(String[] args) {
        int matriz[][] = new int [5] [6];
        int somaLinha[] = new int[5];

        System.out.println("matriz original: ");
         for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = (int) (Math.random() * 35);
                System.out.print(matriz[i][j] + " ");
                somaLinha[i] += matriz[i][j];
            }
            System.out.println();
         }
         System.out.println();

         System.out.println("soma das linhas: ");
         for (int i = 0; i < somaLinha.length; i++) {
            System.out.print(somaLinha[i] + " ");
         }
        System.out.println();
        
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                     matriz[i][j] *= somaLinha[i];
                }
            }
            System.out.println();
            System.out.println("multiplicação de cada elemento da matriz pela soma do vetor: ");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
    }
}
