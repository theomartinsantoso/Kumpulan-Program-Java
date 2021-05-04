/**
* Kode Sumber Program Penghitung Waktu Sekarang
* @author Theo
*/
public class Waktu {
public static void main(String[] args){
//Hitung Detik Sekarang------------------------
/*currentTimeMillis() waktu sekarang dalam mili detik
sejak 1970 tengah malam GMT sejak OS UNIX rilis*/
long totalMilisec = System.currentTimeMillis();
long totalSec = totalMilisec / 1000;
//hitung jumlah detik sekarang
long detik = totalSec % 60;
//Hitung Menit Sekarang
long totalMenit = totalSec / 60;
long menit = totalMenit % 60;
//Hitung Jam Sekarang
long totalJam = totalMenit / 60;
long jam = (totalJam % 24)+7;//jam ditambah 7 karena waktu lokal indonesia

//Hasil
System.out.println("Waktu Sekarang " + jam + ":" +
menit + ":" + detik + " Waktu lokal");
}
}
