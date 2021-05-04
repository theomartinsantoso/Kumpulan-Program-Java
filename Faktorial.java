import java.util.Scanner;


class Faktorial {
    public static void main(String[] args) {
        int bil, n;
        long hasil;

        Scanner scan = new Scanner(System.in); 
        
        System.out.print("n =  ");
        n = scan.nextInt();

		hasil = 1;
		for (bil = n; bil >= 1; bil--)
            hasil = hasil * bil;
			
		System.out.println(n + "! = " + hasil);
    }
}
