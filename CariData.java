class CariData {
    public static void main(String[] args) {
        int[] data = {6, 7, 8, 5, 7, 8, 1, 9};
        int dicari = 5;
        
        System.out.println("Posisi " + dicari + 
                       " dalam larik data: " +
                       cari(data, data.length, dicari));
    }
    
    public static int cari(int[] data, int n, int k) {
        int posisi = 0, i;
        boolean ketemu;
        
        if (n <= 0) 
            posisi = -1;
        else {
            ketemu = false;
            i = 1;
            while ( (i <n-1) && !ketemu )
                if (data[i] == k) {
                    posisi = i;
                    ketemu = true;
                }
                else
                    i++;
                    
            if (!ketemu)
                posisi = -1;            
        }    
        
        return posisi;
    }
}
    
