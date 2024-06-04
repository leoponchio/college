import java.io.*;
import java.util.Scanner;

public class gerenciaArq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        criarArquivo(nomeArquivo);
        verificarExistencia(nomeArquivo);
        removerArquivo(nomeArquivo);
        lerConteudo(nomeArquivo);

        scanner.close();
    }
    public static void criarArquivo(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            if (arquivo.createNewFile()) {
                System.out.println("arquivo criado: " + nomeArquivo);
            } else {
                System.out.println("arquivo ja existe: " + nomeArquivo);
            }
        } catch (IOException e) {
            System.out.println("erro ao criar o arquivo: " + e.getMessage());
        }
    }

    public static void verificarExistencia(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        if (arquivo.exists()) {
            System.out.println("arquivo existe: " + nomeArquivo);
        } else {
            System.out.println("arquivo não existe: " + nomeArquivo);
        }
    }

    public static void removerArquivo(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        if (arquivo.delete()) {
            System.out.println("arquivo removid: " + nomeArquivo);
        } else {
            System.out.println("não foi possivel remover o arquivo: " + nomeArquivo);
        }
    }

    public static void lerConteudo(String nomeArquivo) {
        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("arquivo não encontrado: " + e.getMessage());
        }
    }
}
