import java.util.Scanner;

class warungpadang{
   int hargaMakanan;
   int hargaMinuman;
   int hargaTotal;
   String namaMakanan;
   String namaMinuman;
   void menupilihan(){
   int makanan,minuman;
   Scanner $ = new Scanner(System.in);
   
   System.out.println("--- Menu Makana n & Minuman ---");
   System.out.println("Makanan : ");
   System.out.println("1. Nasi Rendang");
   System.out.println("2. Nasi Ayam Bakar");
   System.out.println("3. Nasi Ayam Goreng");
   System.out.println("minuman: ");
   System.out.println("1. Es Jeruk");
   System.out.println("2. Es Teh");
   System.out.println("3. Jus Jeruk");
   System.out.println("");
   System.out.println("Pilih makanan : ");
   makanan = $.nextInt();
   System.out.println("Pilih minuman : ");
   minuman = $.nextInt();
   
   beliMakanan(makanan);
   beliMinuman(minuman);
   bayar();
   }
   
 void beliMakanan(int pilMakanan){
        int makan = pilMakanan;
        switch(makan){
                case 1:
                namaMakanan = "Nasi Rendang";
                hargaMakanan = 10000;
                break;
                case 2:
                namaMakanan = "Nasi Ayam bakar";
                hargaMakanan = 15000;
                break;
                case 3:
                namaMakanan = "Nasi ayam goreng";
                hargaMakanan = 15500;
                break;
                default:
                  namaMakanan = "";
                  hargaMakanan =  0;
                  }
                  }
                  
                  
  void beliMinuman(int pilMinuman){
        int minuman = pilMinuman;
        switch(minuman){
                case 1:
                namaMinuman = "jus jeruk";
                hargaMinuman = 5000;
                break;
            case 2:
                namaMinuman = "es teh";
                hargaMinuman = 5500;
                break;
            case 3:
                namaMinuman = "es jeruk";
                hargaMinuman = 4000;
                break;
            default:
            namaMinuman = "";
            hargaMinuman = 0;
            }
            }
    void bayar(){
    Scanner $ = new Scanner(System.in);
    if(namaMakanan == "" && namaMinuman == ""){
     System.out.println("anda hanya melihat lihat menu makanan");
      }
    if(namaMakanan != "" || namaMinuman != ""){
    if(namaMakanan == ""){
        System.out.println("anda tidak memilih makanan");
         System.out.println("anda hanya memilih "+namaMinuman);
         }
         if(namaMinuman == ""){
          System.out.println("anda tidak memilih minuman");
           System.out.println("anda hanya memilih "+namaMakanan);
           }
           if(namaMakanan != "" && namaMinuman != ""){
            System.out.println("anda telah membeli "+namaMakanan+" dan "+namaMinuman);
            }
            hargaTotal = hargaMakanan + hargaMinuman;
             System.out.println("total pembayaran : "+hargaTotal);
              System.out.println("bayar : ");
              int bayar = $.nextInt();
              hargaTotal = bayar - hargaTotal;
              if(bayar< 0){
               System.out.println("jangan ngutang");
                System.out.println("sisa utang: "+bayar);
                }else{
                 System.out.println("kembalian : "+hargaTotal);
                 }
                 }
                 }
                 public static void main(String args[]){
                 warungpadang wp = new warungpadang();
                 wp.menupilihan();
                 }
                 }
      
         
            
