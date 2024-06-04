import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class meuSite {
    public static void main(String[] args) {
        String inputFile = "index.html";
        String outputFile = "index.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("<[^>]*>", "");
                writer.write(line);
                writer.newLine();
            }

            System.out.println("arquivo " + outputFile + " criado com sucesso");
        } catch (IOException e) {
            System.err.println("erro ao processar o arquivo: " + e.getMessage());
        }
    }
}
