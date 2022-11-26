

public class _15_Check_if_number_is_prime_Optimized {

    public static boolean isPrime(int n) {

        // Corner case if n = 2
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(isPrime(n));
    }
}
