import java.util.Scanner;

public class questaoPrimos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numero = new int[2];

        System.out.println("digite um numero aleatorio: ");
        numero[0] = ler.nextInt();

        System.out.println("digite outro numero aleatorio: ");
        numero[1] = ler.nextInt();

        int primeiro = numero[0];
        int ultimo = numero[1];

        int[] primos = intervaloPrimos(primeiro, ultimo);

        System.out.println("numeros primos entre " + primeiro + " e " + ultimo + " são: ");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }

    public static int[] intervaloPrimos(int primeiro, int ultimo) {

        int array = 0;
        for (int numero = primeiro; numero <= ultimo; numero++) {
            if (verifPrimo(numero)) {
                array++;
            }
        }

        int[] primos = new int[array];
        int index = 0;

        for (int numero = primeiro; numero <= ultimo; numero++) {
            if (verifPrimo(numero)) {
                primos[index] = numero;
                index++;
            }
        }

        return primos;
    }

    public static boolean verifPrimo(int numero) {
        
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}