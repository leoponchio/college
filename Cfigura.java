public class Cfigura {
    public static void main(String[] args) {
        int linhas = 4;

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}