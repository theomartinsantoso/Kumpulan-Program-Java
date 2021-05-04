class Interseksi {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 6, 8 };
        int[] b = { 4, 6, 1, 5, 2, 8 };
        int[] c = new int[6];
 
        int i, j;
        int jumInterseksi;
        int dicari;

        jumInterseksi = 0;

        for (i = 0; i <= 5; i++) {
            dicari = a[i];
            for (j = 0; j <= 5; j++)      
                if (dicari == b[j]) {
                    c[jumInterseksi] = dicari;
                    jumInterseksi++;
                    break;  
                }
        }

        if (jumInterseksi == 0)
            System.out.println(
                "Hasil interseksi tidak ada");
        else {
            System.out.println("Interseksi:");
            for (i = 0; i < jumInterseksi; i++)
                System.out.println(c[i]);
        }
    }
}
   
