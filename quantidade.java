import java.util.Scanner;

    public class quantidade {
        public static void main(String[]  args) {
            Scanner ler = new Scanner (System.in);
            String nomes[] = new String[5];
            int quantidade[] = new int[nomes.length];

            for (int i = 0; i < nomes.length; i++) {
                System.out.print("escreve um nome: ");
                nomes[i] = ler.next();
                quantidade[i] = nomes[i].length();
            }

            for (int i = 0; i < quantidade.length; i++) {
                System.out.println("o " + nomes[i] + " possui " + quantidade[i] + " letras");
            }
        }
    }