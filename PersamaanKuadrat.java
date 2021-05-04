

// Berkas: PersamaanKuadrat.java

import java.util.Scanner;

class PersamaanKuadrat {
    public static void main(String[] args) {
        double a, b, c, diskriminan;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("a : ");
        a = scan.nextDouble();
        
        System.out.print("b : ");
        b = scan.nextDouble();
        
        System.out.print("c : ");
        c = scan.nextDouble();
		
        diskriminan = b * b - 4 * a * c;
        if (diskriminan > 0) {
            double x1, x2;
            
            x1 = (-b +  Math.sqrt(diskriminan)) / (2 * a);
            x2 = (-b -  Math.sqrt(diskriminan)) / (2 * a);
            System.out.println("Akar real");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }    
        else    
            if (diskriminan == 0) {
                double x1;
                x1 = -b / (2 * a);
                System.out.println("Akar kembar");
                System.out.println("x1, x2 = " + x1);
            }    
            else {
                double re, im;
                
                re = -b / (2 * a);
                im = Math.sqrt(Math.abs(diskriminan)) / (2 * a);
                System.out.println("Akar kompleks");
                System.out.println("x1 = " + re + 
                    " + " + im + "j");
                System.out.println("x2 = " + re + 
                    " - " + im + "j");
            }    
    }
}
