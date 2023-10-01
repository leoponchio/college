public class quest4Ordem {
    public static void main(String[] args) {
        int vetorIS[] = new int [10];
        int vetorBS[] = new int [10];
        int chave;
        int j;
        
        long inicioIS = System.nanoTime();
        for (int i = 1; i < vetorIS.length; i++) {
            vetorIS[i] = (int)(Math.random() * 11);
            chave = vetorIS[i];
            j = i - 1;

            while (j >= 0 && vetorIS[j] > chave) {
                vetorIS[j + 1] = vetorIS[j];
                j = j - 1;
            }
            vetorIS[j + 1] = chave;
        }
        long finalIS = System.nanoTime();
        long tempIS = finalIS - inicioIS;

        long inicioBS = System.nanoTime();
        boolean troca;
        do {
            troca = false;
            for (int i = 0; i < vetorBS.length - 1; i++) {
            vetorBS[i] = (int)(Math.random() * 11);
                if (vetorBS[i] > vetorBS[i + 1]) {
                    int temp = vetorBS[i];
                    vetorBS[i] = vetorBS[i + 1];
                   vetorBS[i + 1] = temp;
                    troca = true;
                }
            }
        } while (troca);
        long finalBS = System.nanoTime();
        long tempBS = finalBS - inicioBS;

        System.out.println("vetor ordenado em Insertion Sort foi " + tempIS + " nanossegundos.");
        System.out.println("vetor ordenado em Bubble Sort foi " + tempBS + " nanossegundos.");
    }
}
