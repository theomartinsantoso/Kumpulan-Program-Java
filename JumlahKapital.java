import java.util.Scanner;


class JumlahKapital {
    public static void main(String[] args) {
        String suatuString;
        int i, jum; 
        char karakter;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Masukkan sebarang string: ");
        suatuString = scan.nextLine();
        
        jum = 0;
        for (i = 0; i < suatuString.length(); i++) { 
            karakter = suatuString.charAt(i);
            if (karakter >= 'A' && karakter <= 'Z')
                jum++;
        }
        
        System.out.println("Jumlah huruf kapital = " +
                           jum); 
    }
} 
