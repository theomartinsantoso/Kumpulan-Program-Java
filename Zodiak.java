// Berkas: Zodiak.java

import java.util.Scanner;

class Zodiak {
    public static void main(String[] args) {
        int tanggal, bulan;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Tanggal (1..31) : ");
        tanggal = scan.nextInt();
        
        System.out.print("Bulan (1..12) : ");
        bulan = scan.nextInt();
		
		if ((tanggal >= 21 && bulan == 3) ||
            (tanggal <= 19 && bulan == 4))
            System.out.println("Zodiak Aries");
        else
           if ((tanggal >= 20 && bulan == 4) ||
               (tanggal <= 20 && bulan == 5))
               System.out.println("Zodiak Taurus");
      else
         if ((tanggal >= 21 && bulan == 5) ||
             (tanggal <= 20 && bulan == 6))
            System.out.println("Zodiak Gemini");
         else
            if ((tanggal >= 21 && bulan == 6) ||
                (tanggal <= 22 && bulan == 7))
               System.out.println("Zodiak Cancer");
            else
               if ((tanggal >= 23 && bulan == 7) ||
                  (tanggal <= 22 && bulan == 8))
                  System.out.println("Zodiak Leo");
               else
                  if ((tanggal >= 23 && bulan == 8) ||
                      (tanggal <= 22 && bulan == 9))
                     System.out.println("Zodiak Virgo");
                  else
                     if ((tanggal >= 23 && bulan == 9) ||
                         (tanggal <= 22 && bulan == 10))
                        System.out.println("Zodiak Libra");
                     else
                        if ((tanggal >= 23 && bulan == 10) ||
                            (tanggal <= 21 && bulan == 11))
                           System.out.println("Zodiak Scorpio");
                        else
                           if ((tanggal >= 22 && bulan == 11) ||
                              (tanggal <= 21 && bulan == 12))
                              System.out.println("Zodiak Sagitarius");
                           else
                              if ((tanggal >= 22 && bulan == 12) ||
                                  (tanggal <= 19 && bulan == 1))
                                 System.out.println("Zodiak Capricorn");
                              else
                                 if ((tanggal >= 20 && bulan == 1) ||
                                    (tanggal <= 18 && bulan == 2))
                                    System.out.println("Zodiak Aquarius");
                                 else
                                    System.out.println("Zodiak Pisces");
    }
}
