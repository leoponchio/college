import java.io.*;
import java.util.Scanner;

class CriarArquivo {
    public static void criar(String nomeArq) {
        try {
            if (!nomeArq.endsWith(".txt")) {
                nomeArq += ".txt";
            }
            File arquivo = new File(nomeArq);
            if (arquivo.createNewFile()) {
                System.out.println("arquivo criado: " + nomeArq);
            } else {
                System.out.println("arquivo já existente: " + nomeArq);
            }
        } catch (IOException e) {
            System.out.println("erro ao criar arquivo: " + e.getMessage());
        }
    }
}

class VerificarArquivo {
    public static void verificarExis(String nomeArq) {
        File arquivo = new File(nomeArq);
        if (arquivo.exists()) {
            System.out.println("arquivo ja existente: " + nomeArq);
        } else {
            System.out.println("arquivo não existente: " + nomeArq);
        }
    }
}

class ExcluirArquivo {
    public static void remover(String nomeArq) {
        File arquivo = new File(nomeArq);
        if (arquivo.delete()) {
            System.out.println("arquivo removido: " + nomeArq);
        } else {
            System.out.println("não foi possivel remover o arquivo: " + nomeArq);
        }
    }
}

class LerArquivo {
    public static void lerCont(String nomeArq) {
        try {
            Scanner scanner = new Scanner(new File(nomeArq));
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

class AlterarConteudoArquivo {
    public static void alterarCont(String nomeArq, String novoCont) {
        try {
            FileWriter writer = new FileWriter(nomeArq);
            writer.write(novoCont);
            writer.close();
            System.out.println("Conteúdo do arquivo atualizado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao atualizar o conteúdo do arquivo: " + e.getMessage());
        }
    }
}

public class lista11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("escreva o nome do arquivo: ");
        String nomeArquivo = ler.nextLine();

        CriarArquivo.criar(nomeArquivo);
        VerificarArquivo.verificarExis(nomeArquivo);
        ExcluirArquivo.remover(nomeArquivo);
        LerArquivo.lerCont(nomeArquivo);

        System.out.print("escreva o novo conteudo do arquivo: ");
        String novoConteudo = ler.nextLine();
        AlterarConteudoArquivo.alterarCont(nomeArquivo, novoConteudo);

        ler.close();
    }
}