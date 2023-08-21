import java.util.Scanner;

    public class soma {
        public static void main(String []args) {
            Scanner ler = new Scanner (System.in);
            int[] valor = new int [10];
            int soma = 0;

            for (int i = 0; i < valor.length; i++) {
                System.out.print("digite um valor aleatorio: ");
                valor[i] = ler.nextInt();
                soma += valor[i];
            }
            System.out.print("soma de todos os valores: " + soma);

        }
    }