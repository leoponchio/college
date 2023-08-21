public class somavet {
    public static void main(String[] args) {
        int[] vetA = { 0, 4, 2, 1, 5, 6, 2, 8, 1, 2, 1, 5, 6, 3, 0 };
        int[] vetB = { 1, 5, 7, 3, 1, 1, 5, 2, 8, 4, 6, 1, 4, 5, 3 };

        int[] vetC = new int[vetA.length];

        for (int i = 0; i < vetA.length; i++) {
            if (i % 2 == 0) {
                vetC[i] = vetA[i] - vetB[i] - (i + 1);
            } else {
                vetC[i] = vetA[i] - vetB[i] + (i + 1);
            }
        }

        System.out.println("vetC:");
        for (int valor : vetC) {
            System.out.print(valor + " ");
        }
    }
}