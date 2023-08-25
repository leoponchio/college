import java.util.Scanner;
public class jogo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String[][] tabuleiro = new String [3][3];
		String[] jogadores = new String[2];;
		int jogadas = 0;
		boolean jogador1vez = true;
		String vencedor = null;
		
		for (int i = 0; i < 2; i++) {
			System.out.print("digite o nome do jogador: ");
				jogadores[i] = ler.nextLine();
		}
			
				
			while (jogadas < 9 && vencedor == null) {
				for (String[] linha : tabuleiro) {
					for (String sinal : linha) {
						System.out.print("[" + (sinal != null ? sinal : " ") + "]");
					}
					System.out.println();
				}
				
				int linha, coluna;
				do {
					System.out.print((jogador1vez ? jogadores[0] : jogadores[1]) + " digite a linha: ");
					linha = ler.nextInt();
					System.out.print((jogador1vez ? jogadores[0] : jogadores[1]) + " digite a coluna: ");
					coluna = ler.nextInt();
				} while (linha < 0 ||  linha > 2 ||  coluna < 0 ||  coluna > 2 ||  tabuleiro[linha][coluna] != null);
				
				tabuleiro[linha][coluna] = jogador1vez ? "x" : "o";
				jogadas++;
				
				for (int i = 0; i < 3 ; i++) {
					if (tabuleiro[i][0] != null && tabuleiro[i][0].equals(tabuleiro[i][1]) && tabuleiro[i][0].equals(tabuleiro[i][2])) {
						vencedor = tabuleiro[i][0];
					} if (tabuleiro[0][i] != null && tabuleiro[0][i].equals(tabuleiro[1][i]) && tabuleiro[0][i].equals(tabuleiro[2][i])) {
						vencedor = tabuleiro[0][i];
					}
				}
					if (tabuleiro[0][0] != null && tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[0][0].equals(tabuleiro[2][2])) {
						vencedor = tabuleiro[0][0];
					} if (tabuleiro[0][2] != null && tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[0][2].equals(tabuleiro[2][0])) {
						vencedor = tabuleiro[0][2];
					}
					jogador1vez = !jogador1vez;
				}
				for (String[] linha : tabuleiro) {
				for (String sinal : linha) {
					System.out.print("[" + (sinal != null ? sinal : " ") + "]");
				}
				System.out.println();
			}
            if  (vencedor != null) {
                if (vencedor.equals("x")) {
                    System.out.println("o vencedor é " + jogadores[0]);
                } else if (vencedor.equals("o")) {
                    System.out.println("o vencedor é " + jogadores[1]);
                }
            } else {
                System.out.println("o jogo terminou empatado");
            }
			}	
	}