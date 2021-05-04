//Program input PIN ATM
//Konsep : User diblokir ketika gagal memasukkan PIN 3 kali
import java.util.Scanner;
public class PinATM {
	public static void main (String [] args){
		
		int counter = 0;
		int pin;
		int counterb = 3;

		Scanner masuk = new Scanner(System.in);
		while (counter < 3) {
		System.out.print("Masukkan PIN anda (3 KALI KESEMPATAN): ");
		pin = masuk.nextInt();
			if (pin == 3333) {
			System.out.println("SELAMAT ANDA TELAH BERHASIL LOGIN");
			break;
			} else {
			counter++;
			}
				if (counter == 3) {
				System.out.println("MAAF, Akun anda telah DIBLOKIR karena gagal memasukkan pin sebanyak "+ counter + " Kali");
				} else {
				System.out.println("MAAF PIN ANDA SALAH, kesempatan " + counterb + " Kali" + " anda telah memasukkan " + counter + " kali");
				}
		}
	}


}
