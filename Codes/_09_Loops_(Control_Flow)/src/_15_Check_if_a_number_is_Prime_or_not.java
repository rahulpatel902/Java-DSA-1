import java.util.*;

public class _15_Check_if_a_number_is_Prime_or_not {

    /*
     * Check if the number is Prime or Composit
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input number: ");
        int n = input.nextInt();

        if (n == 2) {
            System.out.println(n + " is Prime");
        } else {

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println(n + " is Prime");
            } else {
                System.out.println(n + " is Composite");

            }  

        }

        input.close();

         
    }

}
