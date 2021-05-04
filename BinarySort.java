

// Berkas: BinarySort.java

class BinarySort {
    public static void main(String[] args) {
        int i;
        int[] data = {25, 57, 48, 37, 12, 92, 80, 33};
        urutkan(data, data.length);
        
        System.out.println("Hasil pengurutan data:");
        tampilkanLarik(data, data.length);             
    }

    public static void tampilkanLarik(int[] data, int n) {
        for (int i = 0; i < n; i++)
            System.out.printf("%d ", data[i]);
            System.out.println();
    }    
    
    public static void urutkan(int[] data, int n) {
        int j, k;
        int x;
        int kiri, kanan, tengah;
                        
        for (k = 1; k < n; k++) {
            x = data[k];
            
            // Sisipkan x ke dalam data[0..k-1]
            kiri = 0;
            kanan = k - 1;
            
            while (kiri <= kanan) {        
                // Pencarian biner 
                tengah = (kiri + kanan) / 2;
                if (x < data[tengah]) 
                    kanan = tengah - 1;
                else    
                    kiri = tengah + 1;
            }        
             
            // Melakukan penggeseran
            for (j = k - 1; j >= kiri; j--)
                 data[j+1] = data[j];                
                    
            // tempatkan x ke data[kiri]
            data[kiri] = x;                 
            
            System.out.printf("k = %d: ", k);
            tampilkanLarik(data, data.length);
        }        
    }
}
    
