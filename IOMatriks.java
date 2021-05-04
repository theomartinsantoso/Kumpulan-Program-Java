import java.util.Scanner;


class IOMatriks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Jumlah baris : ");
        int jumBaris = scan.nextInt();

        System.out.print("Jumlah kolom : ");
        int jumKolom = scan.nextInt();
        
        int i, j;
        double[][] data = new double [jumBaris][jumKolom];

        for (i = 0; i < jumBaris; i++)
            for (j = 0; j < jumKolom; j++) {
               System.out.printf("Baris %d, kolom %d: ",
                                 i, j);
               data[i][j] = scan.nextDouble();
            }   

        System.out.println("Matriks:");       
        for (i = 0; i < jumBaris; i++) {
            for (j = 0; j < jumKolom; j++)
                System.out.printf("%10.2g ", data[i][j]);
                
            System.out.println();    
        }    
    }
}
