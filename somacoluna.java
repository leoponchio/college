import java.util.Scanner;

public class somacoluna {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int coluna;
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int)(Math.random() * 25);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
       
       do { System.out.print("escolha uma coluna para somar: ");
        coluna = ler.nextInt();

        if (coluna < 0 || coluna > 5 ) {
            System.out.println("coluna invalida.6");
            } 
        } while (coluna < 0 || coluna >= 5);
        
        for (int i = 0; i < 5; i++) {
            soma += matriz[i][coluna];
            }
            System.out.println("Soma da coluna " + coluna + " = " + soma);
        
    }
}