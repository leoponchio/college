public class lerteste {
    public static void main(String[] args) {
        char matriz[][] = new char [5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 1;

               if ((i >= 1 && i <= 1+1) && (j >= 1 && j<=1+1)) 
                matriz[i][j] = 2;    
               System.out.print(matriz[i][j] + " ");
            
            System.out.println();
             }
        }
    }
}