import java.util.Scanner;

class Depresiasi {
    public static void main(String[] args) {
        long biaya;
        int i, jum, tahun;
        double depresiasi;

        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Biaya : ");
        biaya = scan.nextLong();

        System.out.print("Tahun : ");
        tahun = scan.nextInt();

        jum =  tahun * (tahun + 1) / 2;
		for (i = 1; i <= tahun; i++) {
            depresiasi = (tahun + 1.0 - i) / jum * biaya;
            System.out.println(
                String.format("%2d %10.0f",
                    i, depresiasi));
        }
    }


}
