import java.util.Scanner;

public class _10_Sum_of_a_and_b_Input {

        public static void main(String[] args) {

                // Sum of a and b 

                Scanner input = new Scanner(System.in);

                int a = input.nextInt();
                int b = input.nextInt();
                int sum = a + b;

                System.out.println(sum);

                input.close();
        }
}