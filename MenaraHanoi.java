import java.util.Scanner;

class MenaraHanoi {
    public static void main(String[] args) {
        int jumPiring;
        
        Scanner scan = new Scanner(System.in); 
        System.out.print("Jumlah piring = ");
        jumPiring = scan.nextInt();
        
        hanoi(jumPiring, 'A', 'B', 'C');
    }
    
    public static void hanoi(int n, char a, char b, char c) {
        if (n == 1) 
            System.out.println("Pindahkan piring dari " + a + 
                               " ke " + c);
        else {
            hanoi(n-1, a, c, b);
            hanoi(1, a, b, c);
            hanoi(n-1, b, a, c);            
        }    
    }


}
