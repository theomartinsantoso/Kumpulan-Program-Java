class Binomial {
    public static void main(String[] args) {
        System.out.println(binom(1, 1));
        System.out.println(binom(5, 3));
    }
    
    public static int binom(int n, int k) {
        if (k == 0) 
            return 1;
        else
            if (k == n)
                return 1;
            else
                return binom(n-1, k-1) + binom(n-1, k);            
    }
}
