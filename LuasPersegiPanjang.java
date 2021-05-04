import java.util.Scanner;

class LuasPersegiPanjang {
    public static void main(String[] args) {
        double panjang, lebar, luas;
        Scanner scan = new Scanner(System.in);
 
        System.out.println(
		    "Menghitung Luas Persegipanjang");
		
		System.out.print("Panjang = ");
		panjang = scan.nextDouble();
		
		System.out.print("Lebar = ");
		lebar = scan.nextDouble();
		
		luas = panjang * lebar;
		System.out.println("Luas = " + luas);
    }
}
