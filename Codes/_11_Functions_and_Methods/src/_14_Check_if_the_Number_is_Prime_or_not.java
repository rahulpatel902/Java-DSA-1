public class _14_Check_if_the_Number_is_Prime_or_not {

    public static boolean isPrime(int n) {

        // Corner case if n ==2
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 12;

        System.out.println(isPrime(n));

    }
}
