public class somaVets {
    public static void main(String[] args) {
        int vetorA[] = new int [15];
        int vetorB[] = new int [15];
        int vetorC[] = new int [15];

        System.out.println("vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)(Math.random() * 15);
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
         System.out.println("vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = (int)(Math.random() * 15);
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();
        System.out.println("vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.print(vetorC[i] + " ");
        }
        
    }
}