import java.util.Scanner;

class Maksimum {
    public static void main(String[] args) {
        double x, y, z, terbesar;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Bilangan x : ");
        x = scan.nextDouble();
        
        System.out.print("Bilangan y : ");
        y = scan.nextDouble();
        
        System.out.print("Bilangan z : ");
        z = scan.nextDouble();
		
        terbesar = x; // Asumsi x yang terbesar
        
		if (terbesar < y)
            terbesar = y;
            
        if (terbesar < z)
            terbesar = z;
            
        System.out.println("Terbesar = " + terbesar);
    }


}
