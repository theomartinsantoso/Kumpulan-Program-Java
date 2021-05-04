class Fibonacci {

    public static void main(String[] args) {
        int fn, fn1, fn2;
        
        fn1 = 1;
        fn2 = 1;
        
        System.out.print(1 + " ");
        System.out.print(1 + " ");
        
        fn = fn1 + fn2;
		while (fn <= 200) {
            System.out.print(fn + " ");
            fn2 = fn1;
            fn1 = fn;
            fn = fn1 + fn2;
        }
        
        System.out.println(); // Pindah baris
    }
} 
