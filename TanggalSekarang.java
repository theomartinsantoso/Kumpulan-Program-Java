import java.util.*;

class TanggalSekarang
{
 public static void main (String [] args)
 {
 GregorianCalendar tgl;
  
 tgl= new GregorianCalendar();
  
 System.out.println("Tanggal sekarang: " + tgl.get(Calendar.DATE) + "/"
       + tgl.get(Calendar.MONTH) + "/" + tgl.get(Calendar.YEAR));
 }
}
