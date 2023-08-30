import java.util.Scanner;

public class questoesAlunos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] pontuacao = new int[5];
        char respostaAluno[][] = new char[5][10];
        char resposta;
        int qntPerguntas = 10;
        char gabarito[] = {'b', 'c', 'c', 'a', 'e', 'b', 'b', 'c', 'd', 'a'};
        String[] perguntas = {
            "1. Normalmente, quantos litros de sangue uma pessoa tem? Em média, quantos são retirados numa doação de sangue?\n" +
            "a) Tem entre 2 a 4 litros. São retirados 450 mililitros\n" +
            "b) Tem entre 4 a 6 litros. São retirados 450 mililitros\n" +
            "c) Tem 10 litros. São retirados 2 litros\n" +
            "d) Tem 7 litros. São retirados 1,5 litros\n" +
            "e) Tem 0,5 litros. São retirados 0,5 litro\n",
            "2. De quem é a famosa frase. Penso, logo existo?\n" +
            "a) Platão\n" +
            "b) Galileu Galilei\n" +
            "c) Descartes\n" +
            "d) Sócrates\n" +
            "e) Francis Bacon\n",
            "3. De onde é a invenção do chuveiro elétrico?\n" +
            "a) França\n" +
            "b) Inglaterra\n" +
            "c) Brasil\n" +
            "d) Austrália\n" +
            "e) Itália\n",
            "4. Quais o menor e o maior país do mundo?\n" +
            "a) Vaticano e Rússia\n" +
            "b) Nauru e China\n" +
            "c) Mônaco e Canadá\n" +
            "d) Malta e Estados Unidos\n" +
            "e) São Marino e Índia\n",
            "5. Qual o nome do presidente do Brasil que ficou conhecido como Jango?\n" +
            "a) Jânio Quadros\n" +
            "b) Jacinto Anjos\n" +
            "c) Getúlio Vargas\n" +
            "d) João Figueiredo\n" +
            "e) João Goulart\n",
            "6. Qual o grupo em que todas as palavras foram escritas corretamente?\n" +
            "a) Asterístico, beneficiente, meteorologia, entertido\n" +
            "b) Asterisco, beneficente, meteorologia, entretido\n" +
            "c) Asterisco, beneficente, metereologia, entretido\n" +
            "d) Asterístico, beneficiente, metereologia, entretido\n" +
            "e) Asterisco, beneficiente, metereologia, entretido\n",
            "7. Qual o livro mais vendido no mundo a seguir à Bíblia?\n" +
            "a) O Senhor dos Anéis\n" +
            "b) Dom Quixote\n" +
            "c) O Pequeno Príncipe\n" +
            "d) Ela, a Feiticeira\n" +
            "e) Um Conto de Duas Cidades\n",
            "8. Quantas casas decimais tem o número pi?\n" +
            "a) Duas\n" +
            "b) Centenas\n" +
            "c) Infinitas\n" +
            "d) Vinte\n" +
            "e) Milhares\n",
            "9. Atualmente, quantos elementos químicos a tabela periódica possui?\n" +
            "a) 113\n" +
            "b) 109\n" +
            "c) 108\n" +
            "d) 118\n" +
            "e) 92\n",
            "10. Quais os países que têm a maior e a menor expectativa de vida do mundo?\n" +
            "a) Japão e Serra Leoa\n" +
            "b) Austrália e Afeganistão\n" +
            "c) Itália e Chade\n" +
            "d) Brasil e Congo\n" +
            "e) Estados Unidos e Angola\n"
            };

         for(int i = 0; i < 5; i++) {
         System.out.println("respostas do aluno: " + (i+1));
            for (int j = 0; j < qntPerguntas; j++) {
                System.out.println("pergunta " + (j+1) + ": ");
                System.out.print(perguntas[j]);
                resposta = ler.nextLine().charAt(0);
                respostaAluno[i][j] = resposta;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < qntPerguntas; j++) {
                if (respostaAluno[i][j] == gabarito[j]) {
                    pontuacao[i]++;
                }
            }
        }
        System.out.println("pontuações: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("aluno " + (i+1) + ": " + pontuacao[i] + " pontos");
        }
    }
}
