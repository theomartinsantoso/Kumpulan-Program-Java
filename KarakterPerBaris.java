import java.util.Scanner;


class KarakterPerBaris {
    public static void main(String[] args) {
        String suatuString;
        int indeks, jumlahKar;
        char karakter;

        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Masukkan suatu string ");
        suatuString = scan.nextLine();

        jumlahKar = suatuString.length();
        indeks = 0;
        while (indeks < jumlahKar) {
            karakter = suatuString.charAt(indeks);
            System.out.println(karakter);    
            indeks++;
        }
    }
}
