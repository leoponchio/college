public class questao3 {

	public static void main(String[] args) {
	int[][] matriz = new int[3][3];
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			matriz[i][j] = (int) (Math.random ()* 9);
            System.out.print(matriz[i][j] + " ");
        } 		
        System.out.println();
    }

    System.out.println("Matriz Transposta:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
  }
}