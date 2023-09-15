import java.util.Scanner;

public class metodoVetor {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int qntVet = 0;

        System.out.print("digite a quantidade de numeros terá no vetor: ");
        qntVet = ler.nextInt();

         int[] vetor = new int[qntVet];

        for (int i = 0; i < qntVet; i++) {
            System.out.print("digite o numero " + i + " do vetor: ");
            vetor[i] = ler.nextInt();
        }

        imprimirVetor(vetor);

    }
    public static void imprimirVetor(int[] vetor) {
        
        System.out.print("elementos do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}