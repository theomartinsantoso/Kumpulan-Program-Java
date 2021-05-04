import java.util.Scanner;  

public class Listrik {  
    public static void main(String[] args) {  
        System.out.println("Program penghitung pemakaian listrik sederhana");  
        Scanner input = new Scanner(System.in);  
        String nama, kelurahan;  
        System.out.print("Masukkan Nama\t\t\t:");  
        nama = input.nextLine();  
        System.out.print("Kelurahan\t\t\t:");  
        kelurahan = input.nextLine();  
        int a, b, c, d;  
        System.out.print("Masukkan posisi awal Kwh meter\t:");  
        a = input.nextInt();  
        System.out.print("Masukkan posisi akhir Kwh meter\t:");  
        b = input.nextInt();  
        System.out.print("Masukkan biaya beban saat ini\t:");  
        c = input.nextInt();  
        System.out.print("Masukkan PJJ (dalam persen)\t:");  
        d = input.nextInt();  
        int pemakaian, tarif, ppj, total;  
        pemakaian = b - a;  
        tarif = pemakaian * c;  
        ppj = (tarif / 100) * 10;  
        total = tarif + ppj;  
        System.out.println("===================PLN Java===================");  
        System.out.println("Nama\t\t\t:" + nama);  
        System.out.println("Kelurahan\t\t:" + kelurahan);  
        System.out.println("Pemakaian bulan ini\t:" + pemakaian + " Kwh meter");  
        System.out.println("Tarif listrik\t\t:Rp " + tarif + ",-");  
        System.out.println("PPJ total 10%\t\t:Rp " + ppj + ",-");  
        System.out.println("Total bayar\t\t:Rp " + total + ",-");  
        System.out.println("==============================================");  
    }  
}
