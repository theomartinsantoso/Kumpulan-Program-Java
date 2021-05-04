/**

 *
 * @author Theo
 */
public class lempardadu {
    /**
     Program ini untuk simulkasi lempar dadu
     * Angka yanbg ditampilkan setiap dadu merupakan output
     * Yang diikuti dengan total angka pada kedua dadu
     */
    public static void main(String[] args){
    int dadu1; // -> merupakan angka dadu pertama
    int dadu2; // -> merupakan angka dadu kedua
    int hasilLemparan; // total dari angka dadu pertama dan dadu kedua

    dadu1 = (int)(Math.random()*6) + 1;
    dadu2 = (int)(Math.random()*6) + 1;
    hasilLemparan = dadu1 + dadu2;

    System.out.println("Angka pada Dadu Pertama =" + dadu1);
    System.out.println("Angka pada Dadu Kedua =" + dadu2);
    System.out.println("Total Angka Dadu =" + hasilLemparan);
    } // end main(;

} // end class
