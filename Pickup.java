import java.util.Scanner;

public class Pickup {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
     
        String nama, barang, noHP, alamat, tujuan;
        int jarak, paket,berat,beratTotal,jarakTotal,biayaPaket,ppn,biayaTotal;
             
        System.out.println ("PROGRAM PICK-UP BARANG");
        System.out.println ("   ");
        System.out.print ("Masukkan Nama                 = ");
        nama = input.nextLine();
        System.out.print ("Masukkan Nama Barang          = ");
        barang = input.nextLine();
        System.out.print ("Masukkan Nomor HP             = ");
        noHP = input.nextLine();
        System.out.print ("Masukkan Alamat Pengirim      = ");
        alamat = input.nextLine();
        System.out.print ("Masukkan Alamat Tujuan        = ");
        tujuan = input.nextLine();
        System.out.print ("Masukkan Jarak Pengiriman(km) = ");
        jarak = input.nextInt();
        System.out.print ("Masukkan Berat Barang(kg)     = ");
        berat = input.nextInt();
        System.out.println ("Menu Layanan \n 1.Paket Reguler | 2.Paket Khusus | 3.Paket VIP" );
        System.out.print ("Masukkan Pilihan              = ");
        paket = input.nextInt();
        System.out.println ("\n");
        System.out.println ("==========================================================");
        System.out.println ("RESULT");
        System.out.println ("==========================================================");
        System.out.println ("Nama                          = "+nama);
        System.out.println ("Nama Barang                   = "+barang);
        System.out.println ("Nomor HP                      = "+noHP);      
        System.out.println ("Alamat Pengirim               = "+alamat);
        System.out.println ("Alamat Tujuan                 = "+tujuan);
        System.out.println ("Jarak Pengiriman              = "+jarak+" Km");
        System.out.println ("Berat Barang                  = "+berat+" Kg");
     
        switch (paket) {
            case 1:
                beratTotal=berat*10000;
                jarakTotal=jarak*20000;
                biayaPaket=beratTotal+jarakTotal;
                ppn=biayaPaket*10/100;
                biayaTotal=biayaPaket+ppn;
                System.out.println ("Total Biaya Kg                = "+beratTotal);
                System.out.println ("Total Biaya Km                = "+jarakTotal);
                System.out.println ("Nilai PPN 10%                 = "+ppn);
                System.out.println ("Biaya Total                   = "+biayaTotal);
                break;
            case 2:
                beratTotal=berat*20000;
                jarakTotal=jarak*35000;
                biayaPaket=beratTotal+jarakTotal;
                ppn=biayaPaket*10/100;
                biayaTotal=biayaPaket+ppn;
                System.out.println ("Total Biaya Kg                = "+beratTotal);
                System.out.println ("Total Biaya Km                = "+jarakTotal);
                System.out.println ("Nilai PPN 10%                 = "+ppn);
                System.out.println ("Biaya Total                   = "+biayaTotal);
                break;
            case 3:
                beratTotal=berat*30000;
                jarakTotal=jarak*50000;
                biayaPaket=beratTotal+jarakTotal;
                ppn=biayaPaket*10/100;
                biayaTotal=biayaPaket+ppn;
                System.out.println ("Total Biaya Kg                = "+beratTotal);
                System.out.println ("Total Biaya Km                = "+jarakTotal);
                System.out.println ("Nilai PPN 10%                 = "+ppn);
                System.out.println ("Biaya Total                   = "+biayaTotal);
                break;
            default:
                break;
        }
    }
}
