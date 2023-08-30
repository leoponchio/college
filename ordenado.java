import java.util.Arrays;

public class ordenado {
    public static void main(String[] args) {
        int matriz[][] = new int [4] [4];

         for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 20);
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }

        int vetor[] = new int[16];
        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               vetor[a] = matriz[i][j];
                a++;
            }
        }

        Arrays.sort(vetor);
        System.out.println();
        System.out.print("valores ordenados em ordem crescente: ");
        for (int ordem : vetor) {
            System.out.print(ordem + " ");
        }

        a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = vetor[a];
                a++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("matriz com valores ordenados: ");
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}