import java.util.Scanner;

    public class vetor3 {
        public static void main(String []args) {
            Scanner ler = new Scanner(System.in);
            int[] valor = new int[7];
            int soma = 0;
            int par = 0;
            int impar = 0;

            for (int i = 0; i < valor.length; i++) {
                System.out.print("digite um valor inteiro: ");
                valor[i] = ler.nextInt();
                soma += valor[i];

                if (valor[i] % 2 == 0) {
                    par += valor[i];
                } else if (valor[i] % 2 != 0) {
                    impar += valor[i];
                 } 
            }

            System.out.println("todos os numeros somados: " + soma);
            System.out.println("todos os numeros pares somados: " + par);
            System.out.println("todos os numeros imapres somados: " + impar);
                 }
            }