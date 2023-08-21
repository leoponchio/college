import java.util.Scanner;

public class aleatorio {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String nomes[] = new String[3];
        int cont = 1;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("digite nomes aleatorios: ");
            nomes[i] = ler.next();
        }
        
        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i] != null) {
                for (int j = i+1; j < nomes.length; j++) {
                if(nomes[i].equals(nomes[j])) {
                    cont++;
                    nomes[j] = null;
                     }
                 }
                System.out.println(nomes[i] + ": " + cont);
            }
        }
    }
}