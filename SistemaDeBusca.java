import java.util.Scanner;

public class SistemaDeBusca {
    static int tamanhoVetor;
    static int[] vetor;
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            exibirMenuPrincipal();
            opcao = ler.nextInt();

            if (opcao == 1) {
                menuPreencher();
            } else if (opcao == 2) {
                menuBuscar("sequencial");
            } else if (opcao == 3) {
                menuBuscar("binaria");
            } else if (opcao == 4) {
                exibirVetor();
            } else if (opcao == 0) {
                break;
            } else {
                System.out.println("opção invalida");
            }
        }
    }

    private static void exibirMenuPrincipal() {
        System.out.println("Menu Principal");
        System.out.println("1- Preencher Vetor");
        System.out.println("2- Busca Sequencial");
        System.out.println("3- Busca Binária");
        System.out.println("4- Exibir Vetor");
        System.out.println("0- Sair");
    }

    private static void menuPreencher() {
        System.out.println("Menu Preencher");
        System.out.println("1- Informar tamanho do vetor");
        System.out.println("2- Preencher vetor");
        System.out.println("3- Voltar");
        int opcao = ler.nextInt();

        if (opcao == 1) {
            System.out.print("digite o tamanho do vetor: ");
            tamanhoVetor = ler.nextInt();
            vetor = new int[tamanhoVetor];
        } else if (opcao == 2) {
            if (tamanhoVetor == 0) {
                System.out.println("informe o tamanho do vetor");
            } else {
                preencherVetor();
            }
        } else if (opcao != 3) {
            System.out.println("opção invalida");
        }
    }

    private static void preencherVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("digite o valor do vetor " + i + ": ");
            vetor[i] = ler.nextInt();
        }
        bubbleSort();
    }

    private static void bubbleSort() {
        int n = tamanhoVetor;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    private static void menuBuscar(String tipoBusca) {
        if (tamanhoVetor == 0) {
            System.out.println("vetor precisa ser preenchido, opção 1");
            return;
        }
        bubbleSort();

        System.out.println("Menu Buscar (" + tipoBusca + ")");
        System.out.print("digite o valor para pesquisar: ");
        int alvo = ler.nextInt();

        int resultado;
        int comparacoes = 0;

        if (tipoBusca.equals("sequencial")) {
            resultado = buscaSequencial(alvo, comparacoes);
        } else {
            resultado = buscaBinaria(alvo, comparacoes);
        }

        if (resultado != -1) {
            System.out.println("elemento encontrado no indice: " + resultado);
        } else {
            System.out.println("elemento não encontrado no vetor.");
        }
    }

    private static int buscaSequencial(int alvo, int comparacoes) {
        for (int i = 0; i < tamanhoVetor; i++) {
            comparacoes++;
            if (vetor[i] == alvo) {
                System.out.println("comparacoes realizadas: " + comparacoes);
                return i;
            }
        }

        System.out.println("comparacoes realizadas: " + comparacoes);
        return -1;
    }

    private static int buscaBinaria(int alvo, int comparacoes) {
        int inicio = 0;
        int fim = tamanhoVetor - 1;

        while (inicio <= fim) {
            comparacoes++;
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == alvo) {
                System.out.println("comparacoes realizadas: " + comparacoes);
                return meio;
            } else if (vetor[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("comparacoes realizadas: " + comparacoes);
        return -1;
    }

    private static void exibirVetor() {
        if (tamanhoVetor == 0) {
            System.out.println("vetor vazio");
        } else {
            System.out.print("vetor: ");
            for (int i = 0; i < tamanhoVetor; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }
    }
}
