import java.util.Scanner;

class ValidasiNilai {
    public static void main(String[] args) {
        double nilai;

        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Masukkan nilai ujian : ");
        nilai = scan.nextDouble();

		if (nilai >= 0 && nilai <= 100)
            System.out.println("Absah");		
		else
            System.out.println("Tidak absah");				
    }


}
