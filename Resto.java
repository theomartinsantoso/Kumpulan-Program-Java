import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Theo
 */
 
public class Resto {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
        int i = 0;
        int hargatotal = 0;
        int penampung = 0;
        String menu[] = new String [100];
        int harga[] = new int [100];
        String keputusan="Y";

        System.out.println("Daftar Menu Makanan ");
        System.out.println("----------------------------- ");
        System.out.println("1. Batagor         = Rp 5000 ");
        System.out.println("2. Roti Kadet keju = Rp 5000 ");
        System.out.println("3. Indomie+Telor   = Rp 3500 ");
        System.out.println("4. Kwetiaw         = Rp.12.000");

        while (keputusan.equals("Y")||keputusan.equals("y"))
        {
        System.out.print("Pilihan menu anda  = ");
        int pil = input.nextInt();
        if (pil==1){
            menu[i] = "Batagor";
            harga[i] = 5000;
        } else if (pil==2) {
            menu[i]= "Roti Kadet Keju";
            harga[i] = 5000;
        } else if (pil==3) {
            menu[i]="Indomie+Telor";
            harga[i] = 3500;
        } else if (pil==4) {
            menu[i]= "Kwetiaw";
            harga[i] = 12000;
        } else {
            System.out.println("Maaf pilihan menu anda tidak tepat ");
            menu[i]= "Tidak Ada";
        }
            System.out.println("Menu yang anda pesan adalah          : "+menu[i]);
            System.out.println("Harga yang harus dibayar             : "+harga[i]);
            System.out.print("Apakah anda ingin memesan lagi ? Y/T : ");
            try{
                keputusan = input2.readLine();
            }catch(IOException e){
                 System.out.println("Gagal Membaca Keyboard");
            }
            i++;
        }
        System.out.println("");
        System.out.println("Menu yang anda pesan adalah          : "+i);
        for (int a = 0; a<i;a++){
            System.out.print(menu[a]+", ");
        }
        System.out.println("");
        for (int b = 0; b<i;b++){
            hargatotal = hargatotal + harga[b];
        }
        System.out.println("Total yang harus anda bayar adalah   : Rp."+hargatotal);
    }



}
