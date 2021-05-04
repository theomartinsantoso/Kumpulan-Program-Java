import java.util.Scanner;

class JumlahBilangan {
    public static void main(String[] args) {
        int n, jum, pencacah;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("n : ");
        n = scan.nextInt();
		
        jum = 0;
        pencacah = 1;
		while (pencacah <= n) {
            jum = jum + pencacah;
            pencacah++;
        }
        
        System.out.println("Jumlah = " + jum);
    }
}
