public class vetAlt {
    public static void main(String[] args) {
        int vetorA[] = new int [5];
        int vetorB[] = new int [5];
        int vetorC[] = new int [5];

        System.out.println("vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)(Math.random() * 5);
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
         System.out.println("vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = (int)(Math.random() * 5);
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();
        System.out.println("vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[i];
            } else {
                vetorC[i] = vetorB[i];
            }
            System.out.print(vetorC[i] + " ");
        } 
    }
}