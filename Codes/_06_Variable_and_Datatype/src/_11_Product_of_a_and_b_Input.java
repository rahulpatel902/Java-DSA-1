import java.util.Scanner;

public class _11_Product_of_a_and_b_Input {

        public static void main(String[] args) {

                // Product of a and b 

                Scanner input = new Scanner(System.in);

                int a = input.nextInt();
                int b = input.nextInt();
                int product = a * b;

                System.out.println(product);

                input.close(); 
        }
}