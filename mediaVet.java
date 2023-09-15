public class mediaVet {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < vetor.length; i++) {
        vetor[i] = (int)(Math.random() * 10);
        System.out.println("numero: " + vetor[i]);
        soma += vetor[i];
        media = (soma / 10);
        }
        System.out.println("soma dos valores: " + soma);
        System.out.print("media final dos valores: " + media);
    }
}