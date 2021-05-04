import java.util.Scanner;

class Pi {
    public static void main(String[] args) {
        int n, bil;
        double jum, pi;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("n : ");
        n = scan.nextInt();
		
        bil = 1;
        jum = 0;
		while (bil <= n) {
            jum = jum + 1.0 / (bil * bil);
            bil++;
        }
        
        // hitung pi
        pi = Math.sqrt(jum * 6);
        
        System.out.println("pi = " + pi);
    }
}
