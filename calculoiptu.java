import java.util.Scanner;

public class calculoiptu {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        int qntimoveis = 0;
        int numero = 0;
        int atraso = 0;
        double iptu = 0;
        double somaimposto = 0;
        double somamulta = 0;
        double somajuros = 0;
        double somatotal = 0;
        double multa = 0;
        double juros = 0;
        double total = 0;

        while(true) {
            System.out.println("digite o numero do imovel: ");
            numero = ler.nextInt();

            System.out.println("digite o valor do iptu: ");
            iptu = ler.nextDouble();

            System.out.println("digite meses de atraso: ");
            atraso = ler.nextInt();

            multa = iptu * 0.02;
            juros = iptu * 0.015 * atraso;
            total = iptu + juros + multa;

            qntimoveis++;
            somaimposto += iptu;
            somamulta += multa;
            somajuros += juros;
            somatotal += total;

            System.out.println("valor iptu original R$" + iptu);
            System.out.println("valor multa R$" + multa);
            System.out.println("valor juros R$" + juros);
            System.out.println("valor total R$" + total);

            System.out.println("deseja inserir mais imovel? ");
            String continuar = ler.next();
            if (!continuar.equalsIgnoreCase("sim")) {
                break;
            }

        }
        System.out.println("total de imoveis: " + qntimoveis);
        System.out.println("total imposto: " + somaimposto);
        System.out.println("total juros: " + somajuros);
        System.out.println("total multa: " + somamulta);
        System.out.println("total: " + somatotal);

        ler.close();
    }
}