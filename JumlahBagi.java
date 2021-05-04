import java.util.Scanner;


class JumlahBagi {
    public static void main(String[] args) {
        int i, n;
        double jum;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("n : ");
        n = scan.nextInt();

        jum = 1;
        
        for (i = 2; i <= n; i++) 
            if (i % 2 == 0)
                jum = jum - 1.0 / i;
            else
                jum = jum + 1.0 / i;            
            
        System.out.println("Jumlah = " + jum); 
    }
}
