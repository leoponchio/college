import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetor[] = new int[6];
        int maior = vetor[0];
        int menor = vetor[0];
        int maiorposi = 0;
        int menorposi = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("digite um valor: ");
            vetor[i] = ler.nextInt();
        

       if (i == 0 || vetor[i] > maior) {
                maior = vetor[i];
                maiorposi = i;
        }
        
        if (i == 0 || vetor[i] < menor){
                menor = vetor[i];
                menorposi = i;
        }  
    }
            System.out.println("o maior valor do vetor é " + maior + " na posição: " + (maiorposi + 1));
            System.out.println("o menor valor do vetor é " + menor + " na posição: " + (menorposi + 1));

    }
}