class DaftarNegara {
    public static void main(String[] args) {
        String[][] negara = new String [5][2];
        
        negara[0][0] = "Indonesia";
        negara[0][1] = "Jakarta";
        negara[1][0] = "Pilipina";
        negara[1][1] = "Manila";
        negara[2][0] = "Austria";
        negara[2][1] = "Wina";
        negara[3][0] = "India";
        negara[3][1] = "New Delhi";
        negara[4][0] = "Iran";
        negara[4][1] = "Taheran";
        
        String namaNegara;
        for (int baris = 0; baris < negara.length; baris++) {
            namaNegara = negara[baris][0];
            if (namaNegara.charAt(0)==  'I')
                System.out.println(
                    negara[baris][0] + " - " +
                    negara[baris][1]);
        }            
    }
}
 
