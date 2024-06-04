import java.util.Scanner;
import java.util.Random;

class GameOverException extends Exception {
    public GameOverException(String message) {
        super(message);
    }
}

class QuantityException extends Exception {
    public QuantityException(String message) {
        super(message);
    }
}
public class cartasProva {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor, soma, numeroAleatorio;

        try {
            System.out.print("escreva um valor entre 1 á 5: ");
            valor = ler.nextInt();

            if (valor < 1 || valor > 5) {
                throw new QuantityException("inválido");
            }

            Random random = new Random();
            soma = 0;

            for (int i = 0; i < valor; i++) {
                do {
                    numeroAleatorio = random.nextInt(15) + 1;
                } while (numeroAleatorio >= 1 && numeroAleatorio <= 13);

                System.out.println("numero aleatorio: " + numeroAleatorio);
                soma += numeroAleatorio;
            }

            System.out.println("soma: " + soma);

            if (soma > 21) {
                throw new GameOverException("voce perdeu");
            }
        } catch (QuantityException e) {
            System.out.println(e.getMessage());
        } catch (GameOverException e) {
            System.out.println(e.getMessage());
        } finally {
            ler.close();
        }
    }
}
