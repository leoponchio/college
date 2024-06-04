import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("escreva um numero inteiro: ");
        try {
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("o numero digitado foi: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("numero invalido");
        }
        scanner.close();
    }
}
