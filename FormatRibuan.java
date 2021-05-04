class FormatRibuan {
    public static String format(String st) {
        int panjang = st.length();

        if (panjang == 0)
          return "";

        int jum_titik = panjang / 3;

        if (jum_titik == 0)
           return st;

        int jumKar = panjang + jum_titik;
        int posisiTemp = jumKar - 1;

        String strTemp = ""; // String kosong
        while (panjang > 3) {
            /* Ambil tiga karakter terakhir */  
            int posisiSt = panjang - 1;
            for (int i = posisiSt; i > posisiSt - 3; i--) {
                strTemp = strTemp + st.charAt(i);
                posisiTemp = posisiTemp - 1;
            }      
    
            strTemp = strTemp + '.';
            posisiTemp--;

            panjang = panjang - 3; 
        }

        /* Tulis sisa digit */
        if (panjang > 0)
            for (int i = 0; i < panjang; i++)
                strTemp = strTemp + st.charAt(i);
    
        return strTemp;
    }
}
