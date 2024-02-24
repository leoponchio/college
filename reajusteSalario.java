import java.util.Scanner;

public class reajusteSalario {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String cargo;
        Double salario, reajuste, novoSal;
        System.out.print("escreva seu cargo: ");
        cargo = ler.nextLine();

        System.out.print("escreva seu salario atual: ");
        salario = ler.nextDouble();

        reajuste = calcularReajuste(cargo);
        novoSal = salario * (1 + reajuste);

        System.out.println("reajuste: " + (reajuste * 100) + "%");
        System.out.println("novo salario: R$" + novoSal);
    }

    private static double calcularReajuste(String cargo) {
        if (cargo.equalsIgnoreCase("gerente")) {
            return 0.2;
        } else if (cargo.equalsIgnoreCase("tecnico")) {
            return 0.3;
        } else {
            return 0.4;
        }
    }
}
