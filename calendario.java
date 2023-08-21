import java.util.Scanner;

public class calendario {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        String[][] matriz = new String[5][7];
        String[] diasDaSemana = {"DOM SEG TER QUA QUI SEX SAB"};
        int dia = 1;
        int dia1;

        System.out.println("informe o dia da semana em que o mes começa: " );
        System.out.println("0 - Dom, 1 - Seg, 2 - Ter, 3 - Qua, 4 - Qui, 5 - Sex, 6 - Sáb): ");
        dia1 = ler.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j < dia1) {
                    matriz[i][j] = "-";
                } else if (dia <= 30) {
                    matriz[i][j] = Integer.toString(dia);
                    dia++;
                } else {
                    matriz[i][j] = "-";
                }
            }
        }
        for (String dias : diasDaSemana) {
            System.out.print(dias + " ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    }
}