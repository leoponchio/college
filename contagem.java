public class contagem {
    public static void main(String[] args) {
        int[] vetor = new int[20];
        int index = 0;
        
        for (int i = 1; i <= 10; i++) {
            vetor[index] = i * i;
            index++;
            vetor[index] = 0;
            index++;
        }
        
        for (int soma : vetor) {
            System.out.print(soma + " ");
        }
    }
}