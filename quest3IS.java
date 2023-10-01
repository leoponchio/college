import java.util.Scanner;

public class quest3IS {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String vetor[] = new String[5];
        String chave;

        for (int i = 0; i < 5; i++) {
            System.out.print("escreva uma palavra aleatoria: ");
            vetor[i] = ler.next();
        }
        
        System.out.print("palavras fora de ordem alfabetica: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        for (int  i = 1; i < vetor.length; i++) {
            chave = vetor[i];
            int j = i - 1;

            while ( j >= 0 && vetor[j].compareTo(chave) > 0) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
        System.out.print("palavras em ordem alfabetica: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}