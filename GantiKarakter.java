class GantiKarakter {

    public static void main(String[] args) {
        String kalimat = "Bisa! Maka kau bisa";
        char dicari = 'a';
        char pengganti = 'A';
        
        System.out.println(gantiKar(kalimat, dicari, 
                                    pengganti));
    }
    
    public static String gantiKar(String st, char c1, 
                                             char c2) {
        int i, panjang;
        String strTemp = "";
        
        i = 0;
        panjang = st.length();
        for (i = 0; i < panjang; i++) 
            if (st.charAt(i) == c1)
                strTemp = strTemp + c2;
            else 
                strTemp = strTemp + st.charAt(i);        
                    
        return strTemp;
    }
} 
