class PenjumlahanLarik {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 6, 8 };
        int[] b = { 4, 6, 1, 5, 2, 8 };
        int[] c = new int[6];
 
        int i;

        for (i = 0; i < a.length; i++)
            c[i] = a[i] + b[i];

        for (i = 0; i < a.length; i++)
            System.out.println(c[i]);
    }
}
