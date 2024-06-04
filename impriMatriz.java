    import java.util.Scanner;

    public class impriMatriz {

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int linha, coluna;

            System.out.print("escreva o tamanho da linha: ");
            linha = ler.nextInt();

            System.out.print("escreva o tamanho da coluna: ");
            coluna = ler.nextInt();

            int[][] matriz = new int[linha][coluna];

            System.out.print("escreva os elementos da matriz:");
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++)
                matriz[i][j] = ler.nextInt();
            }

            matrizInt(matriz, linha, coluna);
        }

        public static void matrizInt(int[][] matriz, int linha, int coluna) {
            System.out.print("valor da matriz inteira: ");
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
