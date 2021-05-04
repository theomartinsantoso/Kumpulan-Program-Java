class Bunga {

    public static void main(String[] args) {
        long pokok, bunga;
        int tahun;
        
        pokok = 5000000;
		for (tahun = 1; tahun <= 8; tahun++) {
            bunga = pokok * 7 / 100;
            System.out.println(
                String.format("%2d %10d %10d",
                    tahun, pokok, bunga));
                    
            pokok = pokok + bunga;
        }
    }
}  
