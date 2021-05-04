import java.util.Scanner;
/**
* Kode Sumber Program Pencacah Mata Uang
* @author Theo
*/
public class TukarUang {
public static void main(String[] args){
Scanner input = new Scanner(System.in);//membuat fungsi input dari keyboard

//input jumlah uang dari keyboard
System.out.print("Masukanah Uang! : ");
double jumlah = input.nextDouble();

//menghitung jumlah ratus ribu
int ratusRibu = (int)(jumlah / 100000);
int sisa = (int)(jumlah % 100000);
//menghitung jumlah puluh ribu
int puluhRibu = (sisa / 10000);
sisa = sisa % 10000;
//menghitung jumlah ribuan
int ribuan = (sisa / 1000);
sisa = sisa % 1000;
//menghitung jumlah ratusan
int ratusan = sisa / 100;

//cetak hasil
System.out.println("Jumlah = " + jumlah);
System.out.println("Jumlah Ratusan Ribu = " + ratusRibu);
System.out.println("Jumlahh Puluhan Ribu = " + puluhRibu);
System.out.println("Jumlah Ribuan = " + ribuan);
System.out.println("Jumlah Ratusan = " + ratusan);

}
}
