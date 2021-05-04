import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Theo
 */
public class konversi {
    public static void main(String[] args) {
        List<Integer> angka = new ArrayList<Integer>(); 
        // untuk menampung hasil dari perhitungan angka
        try {
            String bil = "01111100011010110100001000110110"; //     
            System.out.println(" panjang bit : " + bil.length());
            String kata = bil;
            char hasil2;
            List<Integer> desimal = new ArrayList<Integer>();
            String hrf = null;
            int p = 0;        
            for (int a = 0; a <= kata.length() / 8; a++) {
                // baris di atas adalah untuk membagikan seluruh bilangan biner menjadi 8 bit
                hrf = kata.substring(p, p + 8);
                //method di atas untuk mengambil angka 0 , 0 + 8 sehingga 8 bit
                // for (int i = 1; i <= hrf.length(); i++) {              
                int hasil = convertBinerToDesimal(hrf);
                hasil2 = (char) hasil;
                p = p + 8;             
                //baris program di atas untuk menambahkan perulangan menjadi 8
                System.out.print(" "+hasil);//hasil desimal
                System.out.print(" "+hasil2);// hasil huruf
            }        
        } catch (Exception e) {
        }
    }
    
    static int convertBinerToDesimal(String binner) {
        int desimal = 0;
        String[] bin = binner.split("");
        int pangkat = 6; 
        //deklarasi pangkat awal 6 - 0
        double totall = 0;
        int total2 = 0;
        for (int i = 2; i < bin.length; i++) {
            //pembacaan perulangan biner dari 0 - 8
            double idata = Integer.parseInt(bin[i]);
            idata = idata * Math.pow(2, pangkat);
            ///baris di atas untuk memangkatkan 2 
            totall += idata;
            //hasil akan di tampung di varibel total
            pangkat--;
            //perulangan - 1
        }
        desimal = (int) totall;
        return desimal;
    }


}
