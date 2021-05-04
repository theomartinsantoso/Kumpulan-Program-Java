import java.util.Scanner;

class PenukaranHuruf {
    public static void main(String[] args) {
        String suatuString;
        int i;
        char karakter;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Masukkan sebarang string: ");
        suatuString = scan.nextLine();

        for (i = 0; i < suatuString.length(); i++) { 
            karakter = suatuString.charAt(i);
            if (karakter >= 'A' && karakter <= 'Z')
                karakter = (char) ((int) karakter + 32);
            else    
                 if (karakter >= 'a' && karakter <= 'z')
                     karakter = (char) ((int) karakter - 32);    
            
            System.out.print(karakter);            
        }
        
        System.out.println();  // Pindah baris
    }
}  
