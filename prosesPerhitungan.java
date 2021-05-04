import java.util.Scanner;

 
public class prosesPerhitungan{
 
    public static void main(String[] args) {
        System.out.println("Menu :");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = sc.nextInt();
        System.out.print("Masukkan a: ");
        int a = sc.nextInt();
        System.out.print("Masukkan b: ");
        int b = sc.nextInt();
        System.out.print("Masukkan r: ");
        int r = sc.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Keliling persegi panjang\t: " + (2 * a + 2 * b) + " cm");
                System.out.println("Luas persegi panjang\t\t: " + (a * b) + " cm2");
                break;
            case 2:
                System.out.println("Keliling lingkaran\t :" + (2 * 3.14 * r) + " cm");
                System.out.println("Luas lingkaran\t\t: " + (2 * 3.14 * (r ^ 2)) + " cm2");
                break;
            case 3:
                int keliling = a + b + r;
                double skeliling = (0.5) * keliling;
                int luas = (int) Math.sqrt((skeliling) * (skeliling - a) * (skeliling - b) * (skeliling - r));
                System.out.println("Keliling segitiga\t : " + keliling + " cm");
                System.out.println("Luas segitiga\t\t : " + luas + " cm2");
                break;
            default:
                System.out.println("Data tidak ditemukan, program dihentikan...");
                break;
        }
    }

    }
