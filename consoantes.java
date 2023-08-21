import java.util.Scanner;

    public class consoantes {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            String palavras[] = new String[10];
            int cont = 0;

            for (int i = 0; i < palavras.length; i++) {
                System.out.print("escreva uma palavra aleatoria: ");
                palavras[i] = ler.next();

                for (int j = 0; j < palavras[i].length(); j++) {
                    if (palavras[i].toLowerCase().charAt(j) != 'a'
                    && palavras[i].toLowerCase().charAt(j) != 'e' 
                    && palavras[i].toLowerCase().charAt(j) != 'i' 
                    && palavras[i].toLowerCase().charAt(j) != 'o' 
                    && palavras[i].toLowerCase().charAt(j) != 'u') {
                        cont++;
                }
            }   
             System.out.println("a palavra " + palavras[i] + " possui " + cont + " consoantes");
             cont = 0;
        }             
    }    
}