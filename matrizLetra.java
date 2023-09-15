import java.util.Random;
import java.util.Scanner;

    public class matrizLetra {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            Random random = new Random();
            char[][] letras = new char[5][5];
            char letra;
            int cont = 0;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    letras[i][j] = (char) (random.nextInt(26) + 'a');
                }
            }

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(letras[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("escolha uma letra: ");
            letra = ler.nextLine().charAt(0);

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (letras[i][j] == letra) {
                        cont++;
                    }
                }
            }
            System.out.println("a letra " + letra + "aparece " + cont + " vezes");
        }
    }