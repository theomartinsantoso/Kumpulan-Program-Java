// Berkas: MaskimumRerata.java

import java.util.Scanner;

class MaksimumRerata {
    public static void main(String[] args) {
        boolean selesai;
        int pencacah;
        double jum, bil, terbesar, rataRata;

        Scanner scan = new Scanner(System.in); 
        
        selesai = false;
        pencacah = 0;
        jum = 0;
        terbesar = 0;
        
        while (selesai == false) {
             System.out.print(
                 "Bilangan (-99999 -> Selesai) = ");
             bil = scan.nextDouble();
             
             if (bil == 99999)
                 selesai = true;
             else {
                 pencacah++;
                 jum = jum + bil;
                 
                 if (pencacah == 1)
                     terbesar = bil;
                 else
                     if (bil > terbesar)
                         terbesar = bil;
             }             
        }        
        
        // Periksa isi pencacah
        if (pencacah == 0)
            System.out.println(
                "Tak ada data yang dimasukkan");
        else {
            rataRata = jum / pencacah;
            System.out.println(
                "Terbesar = " + terbesar);
            System.out.println(
                "Rata-rata = " + rataRata);        
        }
    }


}
