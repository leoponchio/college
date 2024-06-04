import java.sql.SQLOutput;
import java.util.Scanner;

    public class contagem {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int valor;

            System.out.print("informe um valor inteiro: ");
            valor = ler.nextInt();

            contRec(valor);
        }

        public static void contRec(int valor){
            if (valor > 0 ) {
                contRec(valor - 1);
                System.out.print(valor + " ");
            } else if (valor < 0){
                System.out.println("deve ser um valor inteiro");
            }
        }
}
