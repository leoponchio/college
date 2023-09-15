import java.util.Scanner;

public class metodoMatriz {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int qntLinha = 0;
        int qntColu = 0;

        System.out.print("digite a quantidade de linha terá na matriz: ");
        qntLinha = ler.nextInt();

        System.out.print("digite a quantidade de coluna terá na matriz: ");
        qntColu = ler.nextInt();

        int[][] matriz = new int[qntLinha][qntColu];

        imprimirMatriz(matriz);

    }

    public static void imprimirMatriz(int[][] matriz) {

        System.out.println("matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}