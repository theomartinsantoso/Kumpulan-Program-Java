// Berkas: PosisiString.java

class PosisiString {
    public static void main(String[] args) {
        String kalimat = "Daun cemarapun berderai-derai";
        String kata1 = "derai";
        String kata2 = "Dedaunan";
        
        System.out.println(posStr(kalimat, kata1));
        System.out.println(posStr(kalimat, kata2));
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
} 
    
