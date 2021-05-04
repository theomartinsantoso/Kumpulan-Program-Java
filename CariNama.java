class CariNama {
    public static void main(String[] args) {
        String[] daftarNama = 
            { "ahmad dhani", "ali hamdani",
              "edi ahmadi", "dian",
              "fahmi rahmadi" };
              
        cariNama(daftarNama, daftarNama.length, "ahmad");                                          
    }
    
    public static int posStr(String st1, String st2) {
        int indeks1, indeks2, indeks3, posisi;
        boolean ketemu;
        int panjang1 = st1.length();
        int panjang2 = st2.length();
        
        indeks1 = 0;
        posisi = -1;
        ketemu = false;
        
        while ( (indeks1 < panjang1) && (!ketemu) ) {
            // Jika panjang yang dicari lebih panjang 
            //    daripada sisa string untuk pencarian
            if (panjang2 > (panjang1 - indeks1))
                break;
                
            indeks3 = indeks1;
            ketemu = true;
            for (indeks2 = 0; indeks2 < panjang2; indeks2++) {
                if (st1.charAt(indeks3) == st2.charAt(indeks2))
                    indeks3++;
                else {
                    ketemu = false;
                    break;
                }
            }    
            
            if (ketemu)
                posisi = indeks1;
            else
                indeks1++;            
        }
        
        return posisi;
    }
    
    public static void cariNama(String[] daftar, 
                                  int n,
                                  String nama) {
        int i;
        for (i = 0; i < n; i++)
             if (posStr(daftar[i], nama) != -1)
                 System.out.println(daftar[i]);
    } 
} 
    
