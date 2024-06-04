class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String message) {
        super(message);
    }
}

class divisor {
    public double dividir(double numerador, double denominador) throws DivisaoPorZeroException {
        if (denominador == 0) {
            throw new DivisaoPorZeroException("erro: não divide por zero");
        }
        return numerador / denominador;
    }

public class calculadora {
    public static void main(String[] args) {
        calculadora calculadora = new calculadora();
        double numerador = 10;
        double denominador = 0;

        try {
            double resultado = calculadora.dividir(numerador, denominador);
            System.out.println("resultado da divisão: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.out.println("erro: " + e.getMessage());
        }
    }
}
