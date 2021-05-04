import java.util.Scanner;


class Kamus {
    public static void main(String[] args) {
        String kataInggris, kataIndo;
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Kata (one, two, atau three): ");
        kataInggris = scan.nextLine();
        
        if (kataInggris.equals("one")) 
            System.out.println("satu");
        else    
            if (kataInggris.equals("two")) 
                System.out.println("dua");
            else 
                if (kataInggris.equals("three"))
                    System.out.println("tiga");
                else
                    System.out.println("Maaf, saya tidak tahu");                
    }
}
