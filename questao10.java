import java.util.Scanner;
import java.util.InputMismatchException;

public class questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor;
        final int div = 100;

        try {
            System.out.print("escreva um numero para dividir com 100: ");
            divisor = scanner.nextInt();

            int resultado = div / divisor;
            System.out.println("resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("não divide por 0");
        } catch (InputMismatchException e) {
            System.out.println("numero inteiro invalido");
        } finally {
            scanner.close();
        }
    }
}
