public class lec26mathfordsa {
    /*    //printing prime number using square root method
        public static void main(String[] args) {
            int n = 40;
            for(int i = 2; i <= n ; i++){
                System.out.println(i+ "" + prime(i) );
              }
        }
        public static boolean prime(int n) {
            if (n<=1) {
                return false;
            }
            int z = 2;
            for (z=2; z*z<=n ;z++) {
                if (n % z == 0)
                    return false;
            }
            return true;
            }
        }*/
  /*  //SIEVE OF ERATOSTHENES......now we will print prime numbers using sieve of eratosthenes:this is one of the most efficient way to print all the
    // prime numbers smaller than any of the given number
    public static void main(String[] args) {
        int n = 40;
        boolean prime[] = new boolean[n + 1];
        sieve(n, prime);

    }

    public static void sieve(int n, boolean prime[]) {
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i* 2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i =  2; i <= n; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }


    }

   */
    //now printing the sqrt using NEWTONS RAPHON METHOD;

    public static void main(String[] args) {
        System.out.println(String.format("%.5f",sqrt(50)));
    }

    public static double sqrt(double n) {
        double x=n;
        double root;
        while (true) {
            root = 0.5 * (x + n / x);
            if (Math.abs(root - x) < 0.5)//precision can be increased or decreased as per the choice
                                        // ,like if we want more precision the we can change  1 to 0.5 or even less
                break;
            x=root;
        }
        return root;
        }
        public static void reverse( int n){
        System.out.println("the revsqrt would be applied using newtons raphon method ");


        }
    }






