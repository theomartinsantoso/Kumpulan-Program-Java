import java.util.Random;
import java.util.Scanner;
import java.lang.String;
 
/**
 
Nama : Ariska Hidayat
Nim : 100 300 92
Blog : www.ariska138.wordpress.com
 
*/
public class TebakKata {
 // deklarasi variable array gidang lagu
 private static String[] gudangKata = {"informatika", "multithreading", "kompilator", "interpreter", "applet",
 "debugger", "loading", "verify", "execute", "helloworld",
 "enterprise", "alkhawarismy", "bahrie172@gmail.com", "ariska", "hidayat"};
 // deklarasi variable array kata kunci
 private static String[] kataKunci = {"teknik", "fitur", "jdk", "jdk", "jenis java",
 "jdk", "siklus program java", "siklus program java", "siklus program java", "latihan java",
 "edisi java", "tokoh dunia", "email", "mahasiswa stta", "mahasiswa stta"};
 
public static void main(String[] aris) {
 // deklarasi variable dan Class
 Scanner scan = new Scanner(System.in);
 Random rand = new Random();
 int acak = 0;
 int kesempatan;
 String kataPilihan = "";
 boolean ulangi = false;
 boolean loncat = false;
 char pilih = 0, jawab = 0;
 String pilih2 = "";
 String[] ubah;
 boolean back;
 
 do {// tempat jika ingin mengulang permainan
 // tampilan utama
 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 System.out.println(" Game Tebak Kata");
 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 System.out.println(" 1. anda akan diberi kesempatan menebak 8 kali ");
 System.out.println(" 2. kata berhubungan dgn dunia IT ");
 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 lanjut(); // method untuk pemperhenti kompiler
 acak = rand.nextInt(gudangKata.length); // pengacakan angka dengan angka maksimal panjang gudangKata
 kataPilihan = ""; // mereset String kataPilihan
 kesempatan = 8; // memberi kesempatan 8x
 ubah = gudangKata[acak].split(""); // mengubah String ke Array
 for (int c = 0; c <= gudangKata[acak].length(); c++) { // mengganti semua kata dengan simbol
 ubah[c] = "-"; // proses penggantian
 kataPilihan = kataPilihan.concat(ubah[c]); // proses yang sudah diganti di gabungkan dalam kataPilihan
 }
 do { // tempat perulangan proses berlangsung permainan
 System.out.println("\n kesempatan anda menebak : " + kesempatan); // untuk menampilkan jumlah kesempatan menebak
 System.out.println(" Kata Kunci : " + kataKunci[acak]); // untuk menamplikan kata kunci sebagai pemandu penebakan
 System.out.println(" Tebak kata apa ini : " + kataPilihan); // unutk menampilkan kata yang harus ditebak
 System.out.print(" Anda tebak : "); // inputan pilihan
 pilih = scan.next().toLowerCase().charAt(0); // proses inputan
 pilih2 = String.valueOf(pilih); // mengubah dari char ke String
 kataPilihan = proses(kataPilihan, pilih2, acak); // memasukkan hal2 yang penting ke dalam method proses
 if (kataPilihan.equals(gudangKata[acak])) { // melakukan pengecekan apakah sudah sama kata yang ditembak dengan kata yang sebenarnya
 System.out.println("\n Selamat Anda bisa... ^_^"); // mencetak bahwa anda berhasil
 break; // selesai dari permainan
 }
 if (gudangKata[acak].contains(pilih2)) { // apabila kata yang dinputkan mengandung unsur kata yang sebenarya maka perhitungan kesempatan diberhentikan
 continue; // melompat ke akhir permainan
 }
 kesempatan--; // kesempatan berkurang satu apabija jawabannya salah
 } while (kesempatan > 0); // berhenti berulang apabila kesempatan habis
 
 if(kesempatan==0 && !kataPilihan.equals(gudangKata[acak])){ // apabila kesempatan habis dan tabakan salah maka akan mengeluarkan komentar
 System.out.println("\n maaf, anda kurang beruntung!!"); // komentar
 System.out.println(" Jawaban yang benar adalah : "+gudangKata[acak]+"\n\n"); // komentar dan pemberitahuan jawaban yang benar
 lanjut(); // proses pemberhentian sementara
 }
 
 do { // tempat melakukan perulangan jika salah input data
 back = false; // nilai default fasle (tidak mengulang)
 System.out.print("\n Apalah Anda ingin mengulanginya lagi [y/n]: "); // menampilkan pertanyaan
 jawab = scan.next().toUpperCase().charAt(0); // proses input
 System.out.println("\n"); // ganti baris 2 kali
 if (jawab == 'Y') { // apabila menjawab Ya
 ulangi = true; // maka akan mengulangi permainan lagi
 } else if (jawab == 'N') { ////apabila menjawab tidak
 ulangi = false;// maka akan meluar dari permainan
 } else { // jika tidak ada dua2nya
 back = true; // maka anda akan kembali intuk ditanyakan lgi apakah pertanyaan
 }
 } while (back); // mengulang apabila pemain salah memasukkan pilihan
 } while (ulangi); // mengulang apabila pemain menginginkan untuk main lagi
 penutupan(); //menampilkan kata perpisahan
 }
 
private static String proses(String kataPilihan, String pilih2, int acak) { // metode proses kata
 String[] ubah2 = gudangKata[acak].split(""); // mengubah string biasa ke String Array untuk mengecek jawaban yang benar
 String[] ubah = kataPilihan.split(""); // mengubah string biasa ke String Array pada kata yang ditanyakan
 kataPilihan = ""; // peresetan katabilihan supaya tidak tumpukan
 for (int c = 0; c <= gudangKata[acak].length(); c++) { // melakukan perulangan sebanyak gudanKata
 if (ubah2[c].equalsIgnoreCase(pilih2)) { // mengecek apabila kata yang diinputkan apakah sama dengan kata yang sebenarnya
 ubah[c] = ubah2[c]; // mengisi kata yang blm diketahui dari kata yang sebenarnya yang sesuai dengan yang diinputkan
 }
 kataPilihan = kataPilihan.concat(ubah[c]); // menggabungkan semua array menjadi sebuah String
 }
 return kataPilihan; // mengembalikan nilai yang sudah diproses
 }
 
public static void penutupan() { // menampilkan kata perpisahan biar lebih sopan gtu...
 System.out.println("\n\n\n\n\n\n\n");
 System.out.println(" ******************************************************************************");
 System.out.println();
 System.out.println(" -----########-------------------------##-----########-------------------------");
 System.out.println(" ---##---------------------------------##-----##------##-----------------------");
 System.out.println(" -##-------------######---######---######-----##------##--##------##----####---");
 System.out.println(" -##----######-##----##-##----##-##----##-----########------##--##----##----##-");
 System.out.println(" -##--------##-##----##-##----##-##----##-----##------##----##--##----########-");
 System.out.println(" -####------##-##----##-##----##-##----##-----##------##----####------##-------");
 System.out.println(" -----########-########-########---######-----########--------##--------######-");
 System.out.println(" -------------------------------------------------------------##---------------");
 System.out.println(" -----------------------------------------------------------##-----------------");
 System.out.println();
 System.out.println(" ******************************************************************************");
 System.out.println("\n\n");
 }
 
 public static void lanjut() { // untuk pemberhentian sementara
 Scanner scan = new Scanner(System.in); // deklarasi class
 char jawab=0; // deklarasi varialbe
 do {// tempat melakukan perulangan jika menjawab salah
 System.out.print(" Tekan \"c\" kemudian \"enter\" untuk melanjutkan..."); //menampikan kata
 jawab = scan.next().toUpperCase().charAt(0); //memproses inputan
 } while (jawab != 'C');// jika jawabnya tidak c maka akan mengulang
 }
}
