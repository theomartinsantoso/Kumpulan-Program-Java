class JumlahdalamLarik {

    public static void main(String[] args) {
        int[] data = {6, 7, 8, 5, 7, 8, 1, 9};
        int dicari = 8;
        
        System.out.println("Banyak bilangan " + dicari + 
                       " dalam larik data: " +
                       hitung(data, data.length, dicari));
    }
    
    public static int hitung(int[] data, int n, int k) {
        int jumlah, i;
        boolean ketemu;
        
        jumlah = 0;
        for (i = 1; i < n; i++)
            if (data[i] == k)
                jumlah++;
                
        return jumlah;
    }
}
  
