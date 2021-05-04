import java.util.Scanner;

class Zodiak {
    public String nama;
    public int tanggalAwal;   
    public int bulanAwal;   
    public int tanggalAkhir;   
    public int bulanAkhir;   
    
    public Zodiak(String nama, int tanggalAwal, 
                       int bulanAwal, int tanggalAkhir, 
                       int bulanAkhir) {
        this.nama = nama;
        this.tanggalAwal = tanggalAwal;
        this.bulanAwal = bulanAwal;
        this.tanggalAkhir = tanggalAkhir;
        this.bulanAkhir = bulanAkhir;        
    }                   
}

class LarikZodiak {
    public static void main(String[] args) {
        Zodiak[] z = new Zodiak[12];
        z[0] = new Zodiak("Aries", 21, 3, 19, 4);               
        z[1] = new Zodiak("Taurus", 20, 4, 20, 5);               
        z[2] = new Zodiak("Gemini", 21, 5, 20, 6);               
        z[3] = new Zodiak("Cancer", 21, 6, 22, 7);               
        z[4] = new Zodiak("Leo", 23, 7, 22, 8);               
        z[5] = new Zodiak("Virgo", 23, 8, 22, 9);               
        z[6] = new Zodiak("Libra", 23, 9, 22, 10);               
        z[7] = new Zodiak("Scorpio", 23, 10, 21, 11);               
        z[8] = new Zodiak("Sagitarius", 22, 11, 21, 12);               
        z[9] = new Zodiak("Capricorn", 22, 12, 19, 1);               
        z[10] = new Zodiak("Aquarius", 20, 1, 18, 2);               
        z[11] = new Zodiak("Pisces", 19, 2, 20, 3);               
        
        Scanner scan = new Scanner(System.in); 
        System.out.print("Tanggal kelahiran (1..31): ");
        int tanggal = scan.nextInt();

        System.out.print("Bulan kelahiran (1..12): ");
        int bulan = scan.nextInt();

        for (int i = 0; i < 12; i++) 
            if ( ((tanggal >= z[i].tanggalAwal) && 
                  (bulan == z[i].bulanAwal)) ||
                 ((tanggal <= z[i].tanggalAkhir) && 
                  (bulan == z[i].bulanAkhir)) ) {
                System.out.printf("%s\n", z[i].nama);
                break;
            }    
    }
}
