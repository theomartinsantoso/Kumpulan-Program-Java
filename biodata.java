import java.util.Scanner;
public class biodata
{   //yogi.king.pratama@blogspot.com
public static void main (String [] args)
 {
Scanner input=new Scanner (System.in);
int nim,b,i;
String Nama,kelas,alamat;

System.out.print("banyak data:");
b=input.nextInt();

for(i=b;b>0;i++)
{
System.out.print("Masukkan Nama:");
Nama=input.next();
System.out.print("Masukkan nim:");
nim=input.nextInt();
System.out.print("Masukkan kelas:");
kelas=input.next();
System.out.print("Masukkan alamat:");
alamat=input.next();

System.out.println("===========================");
System.out.println("Nama Saya Adalah : " + Nama);
System.out.println("NIM Saya Adalah : " + nim);
System.out.println("Kelas Saya Adalah : " + kelas);
System.out.println("Alamat Saya Adalah : " + alamat);
System.out.println("===========================");
}
}
}
