import java.util.Scanner;

public class superior {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nota[] = new int[5];
        int soma = 0;

        for (int i = 0; i < nota.length; i++) {
            System.out.print("digite sua nota: ");
            nota[i] = ler.nextInt();

            if ( nota[i] >= 60) {
                soma += nota[i];
            }
        }
        System.out.println("a soma das notas a cima de 60 é: " + soma);
    }
}