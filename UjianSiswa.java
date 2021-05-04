import java.util.Scanner;

class DaftarNilai {
    public String nama;
    public int nilai;   
}

class UjianSiswa {
    public static void main(String[] args) {
        final int JUMLAH = 5;
        
        Scanner scan = new Scanner(System.in); 
        String nama;
        DaftarNilai[] data = new DaftarNilai[JUMLAH];
        
        int pencacah = 0;
        
        while (pencacah < JUMLAH) {
            // Bentuk objek berkelas DaftarNilai
            data[pencacah] = new DaftarNilai();
            
            // Baca nama
            System.out.print("Nama : ");
            data[pencacah].nama = scan.nextLine();
            
            // Baca nilai
            while (true) {
                System.out.print("Nilai (0-100) : ");
                data[pencacah].nilai = scan.nextInt();;
                if ( (data[pencacah].nilai >= 0) && 
                     (data[pencacah].nilai <= 100) )
                     break; // Keluar while terdalam          
            }       
            
            // Naikkan pencacah
            pencacah = pencacah + 1;            
            
            // Buang baris tersisa
            scan.nextLine();
        }   

        // Awal penghitungan nilai rata-rata
        double jum = 0;
        pencacah = 0;
        while (pencacah < JUMLAH) {
            jum = jum + data[pencacah].nilai;
            pencacah = pencacah + 1;
        }
        
        double rataRata = jum / 10.0;
        System.out.println("Rata-rata = " + rataRata);
        
        // Menampilkan siswa yang gagal
        System.out.println("Siswa yang gagal");
        pencacah = 0;
        boolean adaGagal = false;
        while (pencacah < JUMLAH) {
            if (data[pencacah].nilai  < 60) {
                adaGagal = true;
                System.out.println(data[pencacah].nama);
            }
            
            pencacah = pencacah + 1;
        }    

	    if (!adaGagal)
            System.out.println("Tidak ada");    
    }
}
