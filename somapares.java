import java.util.Scanner;

    public class somapares {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int valor;
            int soma;

            System.out.print("informe um valor inteiro: ");
            valor = ler.nextInt();

            soma = somapr(valor);

            System.out.println("soma ate " + valor + " é: " + soma);

            somapr(valor);
        }

        public static int somapr(int valor){
            if (valor <= 0 ) {
                return 0;
            } else if (valor % 2 == 0) {
                return valor + somapr(valor - 2);
            } else {
                return somapr(valor - 1);
            }
        }
    }
