import java.io.*;
class BiayaParkir
{
 public static void main (String[ ]args)
 {
 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
 double biaya= 2000;
 double denda= 2000;
 
 try
 { System.out.print("Jam Masuk : ");
  String jmasuk = input.readLine();
  System.out.print("Jam Keluar : ");
  String jkeluar = input.readLine();
  double c = Double.parseDouble(jmasuk);
  double x = Double.parseDouble(jkeluar);
  System.out.print("Apakah Karcis Hilang: ");
  String karcis = input.readLine();
  double jam = x-c;
  double hasil = jam*biaya;
  
  if((karcis.contentEquals("ya"))||(karcis.contentEquals("YA")))
  {
  System.out.println("Total Parkir : "+(hasil+denda));
  }

  else
  { 
   System.out.println("Total Parkir : "+hasil);
  }
 }
 
 catch(IOException ie)
 {
  System.out.println(ie.getMessage());
 }
 }
}
