import java.util.Scanner;
public class PenyewaanPenginapan {
static int kode;
static String nama,alamat, ktp, hp;
   public static void main(String[] args) {
System.out.println("|============================================|");
System.out.println("|PROGRAM PENYEWAAN KAMAR DISUATU PERHOTELAN )|");  
System.out.println("|============================================|");
    Scanner masukan=new Scanner(System.in);
int pilih;
do {
System.out.println("|=================================================|");
        System.out.println("\t     MENU UTAMA");
System.out.println("|=================================================|");
    System.out.println("  1. Data Kamar");
    System.out.println("  2. Data Penyewa");
    System.out.println("  3. Data Transaksi");
    System.out.println("  4. Keluar");
    System.out.print(" Masukan pilihan : ");
    pilih = masukan.nextInt();
    switch (pilih){
       case 1 : datakamar();break;
       case 2 : datapenyewa();break;
       case 3 : datatransaksi();break;}
  } while (pilih!=4);
}
  
private static void datakamar(){
System.out.println("\t\t      DATA KAMAR");
System.out.println("=========================================================");
System.out.println("NO |    TYPE    |ISI|KETERSEDIAN|          HARGA         ");
System.out.println("1. |   SINGLE   | T |     Y     | RP. 150.000,- per malam");
System.out.println("2. |   DOUBLE   | T |     Y     | RP. 250.000,- per malam");
System.out.println("3. |   SUITE    | T |     Y     | RP. 350.000,- per malam");
System.out.println("=========================================================");
System.out.println("Total Semua Kamar   : 50");
System.out.println("Total Kamar Kosong  : 50");
System.out.println("Total Kamar Isi     : 0");
System.out.println("DATA KAMAR KOSONG   : - Single  : 30");
System.out.println("                      - Double  : 10");
System.out.println("                      - Suite   : 10");
System.out.println("=========================================================");
}

private static void datapenyewa(){
Scanner masukan=new Scanner(System.in);
System.out.println("\t\t      DATA PENYEWA");
System.out.println("=========================================================");
System.out.print("Nama Anda        : ");
nama=masukan.next();
System.out.print("Alamat Anda      : ");
alamat=masukan.next();
System.out.println("    ");
System.out.print("NO KTP/SIM Anda  : ");
ktp=masukan.next();
System.out.print("NO Telepon Anda  : ");
hp=masukan.next();
System.out.println(" PILIH KAMAR : ");
System.out.println(" 1. Single  : Rp. 150.000,- per malam");
System.out.println(" 2. Double  : Rp. 250.000,- per malam");
System.out.println(" 3. Suite   : Rp. 350.000,- per malam");
System.out.print("Pilih kode kamar [1/2/3] : ");
kode=masukan.nextInt();
System.out.println("=========================================================");
}

private static void datatransaksi(){
Scanner masukan=new Scanner(System.in);
int single = 150000, db=250000, st=350000;
int total = 0, kembali, sewa;

System.out.println("\t\t      DATA TRANSAKSI");
System.out.println("=========================================================");
System.out.println("\t      DATA YANG DI INPUTKAN");
System.out.println("Nama                : "+nama);
System.out.println("Alamat              : "+alamat);
System.out.println("NO KTP/SIM          : "+ktp);
System.out.println("NO Telepon          : "+hp);
if (kode==1)
{ System.out.println("Kamar yang di pesan : Single");
  System.out.println("Harga Sewa          : Rp. "+single+" per malam");
  System.out.print  ("Lama Sewa           : ");
  sewa=masukan.nextInt();
  total=sewa*single;
}
else if (kode==2)
{ System.out.println("Kamar yang di pesan : Double");
  System.out.println("Harga Sewa          : Rp. "+db+" per malam");
  System.out.print  ("Lama Sewa           : ");
  sewa=masukan.nextInt();
  total=sewa*db;
}
else if (kode==3)
{ System.out.println("Kamar yang di pesan : Suite");
  System.out.println("Harga Sewa          : Rp. "+st+" per malam");
  System.out.print  ("Lama Sewa           : ");
  sewa=masukan.nextInt();
  total=sewa*st;
}
else
{ 
System.out.println("Kode Yang Di Masukkan Salah");}
System.out.println("Total Bayar         : Rp. "+total);
System.out.print  ("Bayar               : Rp. ");
int bayar=masukan.nextInt();
kembali=bayar-total;
System.out.println("Kembalian           : Rp. "+kembali);
System.out.println("=========================================================");
}
}
