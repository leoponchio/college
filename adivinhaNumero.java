import java.util.Scanner;

public class adivinhaNumero {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int pontos = 100;
        int tentativas = 0;
        int tentativaJogador;

        System.out.println("tente adivinhar o numero entre 1 a 100");

        while (pontos > 0) {
            System.out.print("digite um numero: ");
            tentativaJogador = ler.nextInt();
            tentativas++;

            if (tentativaJogador == numeroAleatorio) {
                System.out.println("numero correto: " + numeroAleatorio);
                System.out.println("pontos: " + pontos + " em " + tentativas + " tentativas");
                break;
            } else {
                System.out.println("numero errado, o numero digitado é " + (tentativaJogador > numeroAleatorio ? "maior" : "menor") + " que o certo");
                int pontosPerdidos = tentativas * 10;
                pontos -= pontosPerdidos;
                System.out.println("perdeu " + pontosPerdidos + " pontos, pontuação total: " + pontos);
            }
        }

        if (pontos <= 0) {
            System.out.println("voce zerou seus pontos, o numero correto é: " + numeroAleatorio);
        }

      
    }
}
