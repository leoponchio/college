import java.util.Scanner;

    public class soma3 {
        public static void main(String[] args){
            Scanner ler = new Scanner(System.in);
            int vetorA[] = new int[10];
            int vetorB[] = new int[10];
            int vetorC[] = new int[10];

            for (int i = 0; i < vetorA.length; i++) {
                System.out.print("digite valor " + i + " do primeiro vetor: ");
                vetorA[i] = ler.nextInt();
            }

            for (int i = 0; i < vetorB.length; i++) {
                System.out.print("digite valor " + i + " do segundo vetor: ");
                vetorB[i] = ler.nextInt();
            }

            for (int i = 0; i < vetorC.length; i++){
                  vetorC[i] = vetorA[i] + vetorB[i];   
            }

            System.out.print("o valor dos dois vetores: "); 
            for (int i = 0; i < vetorC.length; i++) {
                System.out.print(vetorC[i] + " ");
            }       
         }
    }