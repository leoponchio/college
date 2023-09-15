import java.util.Scanner;

    public class vetorLetra {
        /**
         * @param args
         */
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            String palavra;
            char vetor[] = new char[10];

            System.out.println("escreva uma palavra até 10 letras: ");
            palavra = ler.nextLine();

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = '.';
                for (int j = 0; j < palavra.length() && j < vetor.length; j++) {
                    vetor[j] = palavra.charAt(j);
                }
            }
            
            for (char letra : vetor) {
                System.out.print(letra);
            }
        }
    } 