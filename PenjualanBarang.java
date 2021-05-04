import java.util.Scanner ;

public class PenjualanBarang {
public static void main(String[] args) {
  Scanner masukan= new Scanner(System.in);
     int pm,totalHarga,bb,uangb,kembalian, Harga=0,Potongan=0,totbayar = 0;
System.out.println("Program Penjualan Barang Dagangan : Tugas Praktikum Ke-2 ");
       
        System.out.println("|---------------------------------------|");
        System.out.println("|       MENU PILIHAN MEREK BUKU         |");
        System.out.println("|---------------------------------------|");
        System.out.println("|BARANG           |HARGA                |");  
        System.out.println("|---------------------------------------|");
        System.out.println("|1.Sidu           | Rp.3.000/Buah       |");
        System.out.println("|2.KiKy           | Rp.3.500/Buah       |");
        System.out.println("|3.Mirage         | Rp.1.500/Buah       |");
        System.out.println("|4.Joyko          | Rp.1.700/Buah       |");
        System.out.println("|5.Kenko          | Rp.1.600/Buah       |");
        System.out.println("|6.Faber Castel   | Rp.1.800/Buah       |");
        System.out.println("|7.Steadler       | Rp.2.000/Buah       |");
        System.out.println("|---------------------------------------|");
        System.out.print("Barang yang anda Beli [1/2/3/4/5/6/7]:");
            pm=masukan.nextInt();
            {
                if(pm==1)
                {System.out.println("Merek yang dipilih : Sidu");
                    Harga=3000;
                    System.out.print("Harga :"+Harga);}          
                if(pm==2)
                {System.out.println("Merek yang dipilih : KiKy");
                    Harga=3500;
                    System.out.print("Harga :"+Harga);}
                if(pm==3)
                {System.out.println("Merek yang dipilih : Mirage");
                    Harga=1500;
                    System.out.print("Harga :"+Harga);}
                if(pm==4)
                {System.out.println("Merek yang dipilih : Joyko");
                    Harga=1700;
                    System.out.print("Harga :"+Harga);}          
                if(pm==5)
                {System.out.println("Merek yang dipilih : Kenko");
                    Harga=1600;
                    System.out.print("Harga :"+Harga);}
                if(pm==6)
                {System.out.println("Merek yang dipilih : Faber Castel");
                    Harga=1800;
                    System.out.print("Harga :"+Harga);}
                if(pm==7)
                {System.out.println("Merek yang dipilih : Steadler");
                    Harga=2000;
                    System.out.print("Harga :"+Harga);}
            }
        System.out.print("\nBanyak barang yang dibeli:");
        bb=masukan.nextInt();
 {
                if (bb==12)
                {System.out.println("***...Selamat Anda Mendapat Diskon 10%");
                    Potongan= Harga*bb * 10 / 100;
                    System.out.print("Anda mendapat Potongan Harga Sebesar ::"+Harga*bb * 10 / 100);}
                if (bb==13)
                {System.out.println("***...Selamat Anda Mendapat Diskon 10%");
                    Potongan= Harga*bb * 10 / 100;
                    System.out.print("Anda mendapat Potongan Harga Sebesar :"+Harga*bb * 10 / 100);}
                if (bb==14)
                {System.out.println("***...Selamat Anda Mendapat Diskon 10%");
                    Potongan= Harga*bb * 10 / 100;
                    System.out.print("Anda mendapat Potongan Harga Sebesar :"+Harga*bb * 10 / 100);}
                if (bb==15)
                {System.out.println("***...Selamat Anda Mendapat Diskon 10%");
                    Potongan= Harga*bb * 10 / 100;
                    System.out.print("Anda mendapat Potongan Harga Sebesar :"+Harga*bb * 10 / 100);}
                if (bb==16)
                {System.out.println("***...Selamat Anda Mendapat Diskon 10%");
                    Potongan= Harga*bb * 10 / 100;
                    System.out.print("Anda mendapat Potongan Harga Sebesar :"+Harga*bb * 10 / 100);}
                if (bb==17)
                {System.out.println("***...Selamat Anda Mendapat Diskon 10%");
                    Potongan= Harga*bb * 10 / 100;
                    System.out.print("Anda mendapat Potongan Harga Sebesar :"+Harga*bb * 10 / 100);}
                if (bb==18)
                {System.out.println("Anda Mendapat Diskon 10%");
                    Potongan= Harga*bb * 10 / 100;
                    System.out.print("Anda mendapat Potongan Harga Sebesar :"+Harga*bb * 10 / 100);}
                if (bb==19)
                {System.out.println("***...Selamat Anda Mendapat Diskon 10%");
                    Potongan= Harga*bb * 10 / 100;
                    System.out.print("Anda mendapat Potongan Harga Sebesar :"+Harga*bb * 10 / 100);}
                if(bb>19)
                {System.out.println("***...Selamat Anda Mendapat Diskon 15%");
                    Potongan= Harga*bb*15/100;
                    System.out.print("Anda mendapat Potongan Harga Sebesar :"+Harga*bb*15/100);}
                if(bb<12)
                {System.out.println(" ");
                 System.out.println("  Anda Suka ***Diskon*** SAYA AKAN BERIKAN ITU Jika anda:");
                 System.out.println("1. Belanja Lebih dari 1 Lusin Anda Mendapat Diskon 10%");
                 System.out.println("2. Belanja Lebih dari 1 Kodi  Anda Mendapat Diskon 15%");
                System.out.println("***Jadi tunggu Apalagi Dapatkan Diskonnya Sekarang JUGA***");}
            }
        totalHarga= Harga * bb;
            System.out.println();
            System.out.println("Total Harga=RP."+totalHarga);
        totbayar = totalHarga - Potongan;
            System.out.println("Total Bayar=Rp."+totbayar);
            System.out.print("Uang Bayar anda=Rp.");
        uangb=masukan.nextInt();
        kembalian=uangb-totbayar;
            System.out.println("Kembalian=RP."+kembalian);
System.out.println("|---------------------------------------================================|");
System.out.println("|                              	 Oleh : Theo Martin Santoso				|");  
System.out.println("|---------------------------------------================================|");
         
    }
}
