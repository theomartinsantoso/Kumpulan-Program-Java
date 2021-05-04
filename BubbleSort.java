

// Berkas: BubbleSort.java

class BubbleSort {
    public static void main(String[] args) {
        int i;
        int[] data = {10, 80, 30, 90, 40, 50, 70};
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
        int tahap, j, tmp;
        
        for (tahap = 1; tahap < n; tahap++) {
            for (j = 0; j < n - tahap; j++)         
                if (data[j] > data[j+1]) {
                    // Tukarkan
                    tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
                
            System.out.printf("Hasil tahap %d: ", tahap);
            tampilkanLarik(data, n);            
        }        
    }
}
    
