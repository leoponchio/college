public class questao8 {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            int elemento = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("erro na estrutura, posição nula");
        }
    }
}
