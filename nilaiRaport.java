import java.util.Scanner;
import java.io.*;

public class nilaiRaport {
	
public float nilai_UAS = 0;
public float nilai_UTS = 0;
public float nilai_tugas= 0;
public float nilai_absen = 0;
public float nilai_akhir = 0;
public float nilai1 = 0;
public float nilai2 = 0;
public float nilai3 = 0;
public float nilai4 = 0;
public String Grade = "";
public String Kriteria = "";

public void scanNilai(){
Scanner n = new Scanner(System.in);
System.out.print("Nilai UAS :");
nilai1 = n.nextFloat();
System.out.print("Nilai UTS :");
nilai2 = n.nextFloat();
System.out.print("Nilai Tugas :");
nilai3 = n.nextFloat();
System.out.print("Nilai Absen :");
nilai4 = n.nextFloat();

nilai_UAS = nilai1*45/100;
nilai_UTS = nilai2*25/100;
nilai_tugas = nilai3*20/100;
nilai_absen = nilai4*10/100;
}

public void nilai_akhir(){
nilai_akhir = nilai_UAS + nilai_UTS + nilai_tugas + nilai_absen;
System.out.println("Nilai Akhir : "+ nilai_akhir);
if(nilai_akhir > 90){
Grade ="A";
Kriteria ="LULUS";
}else if(nilai_akhir > 80){
Grade = "B";
Kriteria ="LULUS";
}else if(nilai_akhir > 70){
Grade ="C";
Kriteria = "LULUS";
}else if(nilai_akhir > 60){
Grade ="D";
Kriteria ="TIDAK LULUS";
}else if(nilai_akhir <= 60){
Grade ="E";
Kriteria = "TIDAK LULUS";
}

System.out.println("Grade : "+Grade);
System.out.println("Kriteria : "+Kriteria);
System.out.println("------------------------------------------------------------");
}

public static void main(String [] args){
nilaiRaport t = new nilaiRaport();
t.scanNilai();
t.nilai_akhir();
}
}
