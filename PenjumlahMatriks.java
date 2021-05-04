class PenjumlahanMatriks {

    public static void main(String[] args) {
        int[][] a = { {6, 7}, {5, 8} };
        int[][] b = { {1, 3}, {4, -1} };
        int[][] c = new int[2][2];
 
        int i, j;

        for (i = 0; i < 2; i++)
            for (j = 0; j < 2; j++)
               c[i][j] = a[i][j] + b[i][j];

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++)
                System.out.printf("%3d", c[i][j]);
                
            System.out.println();    
        }    
    }
}
