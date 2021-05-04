class Larik {

    public static double elemenTerkecil(double[] x, int jum) {
        double min;
        
        min = x[0];
        for (int i = 1; i < jum; i++)
            if (x[i] < min)
                min = x[i];

        return min;                
    }
}
