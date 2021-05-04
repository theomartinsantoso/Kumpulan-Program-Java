import java.util.Scanner;


class FibonacciRekursif {
    public static void main(String[] args) {
        int n;
        long hasil;
        
        Scanner scan = new Scanner(System.in); 
        System.out.print("n = ");
        n = scan.nextInt();
        
        hasil = fib(n);
        System.out.println("fib(" + n + ") = " + hasil);
    }
    
    public static long fib(int n) {
        if (n == 0) 
            return 0;
        else
            if (n == 1)
                return 1;
            else
                return fib(n-1) + fib(n-2);            
    }
}
