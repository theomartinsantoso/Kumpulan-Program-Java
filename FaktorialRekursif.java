import java.util.Scanner;

class FaktorialRekursif {
    public static void main(String[] args) {
        int n;
        long hasil;
        
        Scanner scan = new Scanner(System.in); 
        System.out.print("n = ");
        n = scan.nextInt();
        
        hasil = faktorial(n);
        System.out.println(n + "! = " + hasil);
    }
    
    public static long faktorial(int n) {
        if ( (n == 0) || (n == 1) )
            return 1;
        else
            return n * faktorial(n-1);
    }
}
