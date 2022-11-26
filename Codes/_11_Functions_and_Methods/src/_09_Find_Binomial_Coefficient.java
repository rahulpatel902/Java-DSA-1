public class _09_Find_Binomial_Coefficient {

    //Find Factorial of number n
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    //Find Binomial coefficient
    public static int binoCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial((n - r));

        int biCoff = fact_n / (fact_r * fact_nmr);

        return biCoff;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        System.out.println(binoCoeff(n, r));

    }
}