

// Berkas: SinX.java

import java.util.Scanner;

class SinX {
    public static void main(String[] args) {
        int i, j;
        double sinx, x, hasilPangkat, faktorial;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print(
            "Masukkan sudut dalam radian: ");
        x = scan.nextDouble();
        
        sinx = x;
        for (i =  2; i <= 10; i++) {   
             // Hitung (2i-1)!
             faktorial = 1;
             for (j = 2 * i - 1; j >= 1; j--)
                  faktorial = faktorial * j;
                  
             // Hitung x pangkat (2i-1)
             hasilPangkat = 1;
             for (j = 1; j <= 2 * i -1; j++)
                  hasilPangkat *= x;
                  
             // Hitung jumlah sampai suku ke-i     
             if (i % 2 == 0) // genap
                 sinx = sinx - hasilPangkat / faktorial;
             else
                 sinx = sinx + hasilPangkat / faktorial;
        }     
        
        System.out.println(
            "Sin x menurut perhitungan: " + sinx);
        System.out.println(
            "Sin x menurut pustaka    : " + Math.sin(x));
    }
}
