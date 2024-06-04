import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class contagemString {
    public static void main(String[] args) {
        String nomeArquivo = "arquivo.txt";
        String palavraBuscada = "exemplo";
        int ocorrencias = contarOcorrencias(nomeArquivo, palavraBuscada);
        System.out.println("a palavra: '" + palavraBuscada + "' aparece " + ocorrencias + " vezes no arquivo.");
    }
    public static int contarOcorrencias(String nomeArquivo, String palavra) {
        int contador = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                contador += contarOcorrenciaLinha(linha, palavra);
            }
        } catch (IOException e) {
            System.out.println("erro ao ler o arquivo: " + e.getMessage());
        }
        return contador;
    }

    private static int contarOcorrenciaLinha(String linha, String palavra) {
        int contador = 0;
        int index = linha.indexOf(palavra);
        while (index != -1) {
            contador++;
            index = linha.indexOf(palavra, index + 1);
        }
        return contador;
    }
}
