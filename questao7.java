public class questao7 {
    public static void main(String[] args) {
        String a = null;
        try {
            int length = a.length();
        } catch (NullPointerException e) {
            System.out.println("variavel nula");
        }
    }
}
