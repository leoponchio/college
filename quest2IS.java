public class quest2IS {
    public static void main(String[] args) {

        int vetor[] = new int[10];
        int chave;
        int j;
        
        System.out.print("vetor desordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * 11);
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        for (int  i = 1; i < vetor.length; i++) {
            chave = vetor[i];
            j = i - 1;

            while ( j >= 0 && chave > vetor[j]) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
        System.out.print("valor em ordem decrescente: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}