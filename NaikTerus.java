import java.util.Scanner;

class NaikTerus {
    public static void main(String[] args) {
        int n, pencacah, nilai;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Data pembatas : ");
        n = scan.nextInt();
		
        pencacah = 1;
        nilai = 1;
		while (nilai <= n) {
            System.out.print(nilai + " ");
            nilai = nilai + pencacah;
            pencacah++;
        }
                
        System.out.println(); // Pindah baris
    }
}
