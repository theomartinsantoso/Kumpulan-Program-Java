import java.util.Scanner;


class Pangkat {
    public static void main(String[] args) {
        int y, n;
        long hasil;
        
        Scanner scan = new Scanner(System.in); 
        System.out.println("Menghitung y pangkat n");
        System.out.print("y = ");
        y = scan.nextInt();
        
        System.out.print("n = ");
        n = scan.nextInt();
        
        hasil = pangkat(y, n);
        System.out.println(y + " pangkat " + n + " = " + hasil);
    }
    
    public static long pangkat(int y, int n) {
        if (n == 1) 
            return y;
        else
            return y * pangkat(y, n-1);
    }
}
