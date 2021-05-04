class PosisiKarakter {
    public static void main(String[] args) {
        String kalimat = "Selamat belajar";
        char dicari = 'a';
        
        System.out.println("Posisi " + dicari + 
                       " dalam string : " +
                       posKar(kalimat, dicari));
        
        dicari = 'm';        
        System.out.println("Posisi " + dicari + 
                       " dalam string : " +
                       posKar(kalimat, dicari));
    }
    
    public static int posKar(String st, char k) {
        int i, posisi, panjang;
        
        i = 0;
        posisi = -1;
        panjang = st.length();
        while ( (i < panjang - 1) && (posisi == -1) ) {
            if (st.charAt(i) == k)
                posisi = i;
            else {
                i = i + 1;
            }            
        }        
            
        return posisi;
    }
} 
