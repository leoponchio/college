import java.util.Scanner;

class OpcaoInvalidaException extends Exception {
    public OpcaoInvalidaException(String mensagem) {
        super(mensagem);
    }
}
public class calculadoraProva {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        double numerador, denominador, resultadoDivisao;
        double base, expoente, resultadoExponenciacao;
        double radicando, resultadoRaizqrd;

        try {
            System.out.println("escolha entre as opções:");
            System.out.println("1- divisão");
            System.out.println("2- exponenciação ");
            System.out.println("3- raiz quadrada");
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.print("escreva o numerador: ");
                numerador = ler.nextDouble();
                System.out.print("escreva o denominador: ");
                denominador = ler.nextDouble();
                if (denominador == 0) {
                    throw new ArithmeticException("a divisão por 0 não é possivel");
                }
                resultadoDivisao = numerador / denominador;
                System.out.println("resultado: " + resultadoDivisao);
            }
            else if (opcao == 2) {
                System.out.print("escreva a base: ");
                base = ler.nextDouble();
                System.out.print("escreva o expoente: ");
                expoente = ler.nextDouble();
                if (base == 0 && expoente == 0) {
                    throw new ArithmeticException("ambos não podem ser zero");
                }
                resultadoExponenciacao = Math.pow(base, expoente);
                System.out.println("resultado: " + resultadoExponenciacao);
            }  else if (opcao == 3) {
                System.out.print("escreva o radicando: ");
                radicando = ler.nextDouble();
                if (radicando <= 0) {
                    throw new ArithmeticException("deve ser maior que zero");
                }
                resultadoRaizqrd = Math.sqrt(radicando);
                System.out.println("resultado: " + resultadoRaizqrd);
                throw new OpcaoInvalidaException("inválido");
        }
    } catch (OpcaoInvalidaException e) {
        System.out.println(e.getMessage());
    } catch (ArithmeticException e) {
        System.out.println("Erro aritmético: " + e.getMessage());
            }
        }
    }
