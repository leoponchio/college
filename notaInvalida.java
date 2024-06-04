import java.util.Scanner;
class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String message) {
        super(message);
    }
}

public class notaInvalida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("digite a nota de 0 a 10: ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                throw new NotaInvalidaException("a nota deve estar entre 0 e 10.");
            }

            System.out.println("nota valida: " + nota);
        } catch (NotaInvalidaException e) {
            System.out.println("erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
