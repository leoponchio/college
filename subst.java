import java.util.Scanner;

    public class subst {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            String palavra[] = new String[10];
            String vogais[] = {"a" , "e" , "i" , "o" , "u" ,};

            for (int i = 0; i < palavra.length; i++) {
                System.out.print("Escreva um nome aleatorio: ");
                palavra[i] = ler.next();
            }

            for (int i = 0; i < palavra.length; i++) {
                for (int j = 0; j < vogais.length; j++) {
                    palavra[i]= palavra[i].toLowerCase().replace(vogais[j], Integer.toString(j));
                }
            }

            for (int i = 0; i < palavra.length; i++) {
                System.out.println(palavra[i]);
            }
    }
}