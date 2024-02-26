public class calcMeia {
    public static void main(String[] args) {
        int valor = 1;
        double resultado = calcSeq(valor);
        System.out.println("resultado: " + resultado);
    }
    public static double calcSeq (int valor) {
        if (valor == 0) {
            return 1;
        } else {
            return 1 / (valor + calcSeq(valor - 1));
        }
    }
}
