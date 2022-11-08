//import java.util.Scanner;

public class _16_Loops_Questions {

    public static void main(String[] args) {

        /*
         * Loops Question
         * --------------
         */

        /*
         * Question 01:
         * -----------
         * How many times 'Hello' is printed?
         * for(int i=0; i<5; i++) {
         * System.out.println("Hello");
         * i+=2;
         * }
         * ----------------------------------
         * Solution 01: 'Hello' will be printed 2 times
         * --------------------------------------------
         */

        /*
         * Question 02:
         * ------------
         * Write a program that reads a set of integers, and then prints the sum of the
         * even and odd integers.
         * -------------------------------------------
         * Solution 02:
         * ------------
         */
/* 
        Scanner input = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number ");
            number = input.nextInt();

            if (number % 2 == 0) {
                evenSum = evenSum + number;
            } else {
                oddSum = oddSum + number;
            }

            System.out.print("Do you want to continue? Press 1 for 0 ");
            choice = input.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
 */
        /*
         * Question 03:
         * ------------
         * Write a program to find the factorial of any number entered by the user
         * -------------------------------------------
         * Solution 03:
         * ------------
         */

/*         
         int sum = 1;
         
         Scanner input = new Scanner(System.in);
         
         System.out.println("Input Number: ");
         int n = input.nextInt();
         
         for(int i = 1; i <= n; i++){
         
         sum = i * sum;
         
         
         }
         
         input.close();
         
         System.out.println(sum);
          */

        /*
         * Question 04:
         * ------------
         * Write a program to print the multiplication table of a number N, entered by
         * the user.
         * -------------------------------------------
         * Solution 04:
         * ------------
         * 
         * Scanner input = new Scanner(System.in);
         * 
         * System.out.println("Multiplication Table of : ");
         * int n = input.nextInt();;
         * 
         * for(int i = 1; i <= n; i++){
         * 
         * System.out.println(n + " * " + i + " = " + n*i);
         * 
         * }
         * ----------------------------------------------------
         */

        /*
         * Question 05:
         * ------------
         * What is wrong in the following program?
         * -------------------------------------------
         * for(int i = 0; i <= 5; i++ ) {
         * System.out.println("i = " + i );
         * }
         * System.out.println("i after the loop = " + i );
         * -----------------------------------------------
         * Solution 05:
         * ------------
         * [System.out.println("i after the loop = " + i );]
         * in this code block [i] will show error as integer i is initialised under for
         * loop not outsite the for loop
         * so to fix this we need to initialize integer i out of the for loop:
         * --------------------------------------------------
         * FIX CODE:
         * --------
         * int i;
         * for(i = 0; i <= 5; i++ ) {
         * System.out.println("i = " + i );
         * }
         * System.out.println("i after the loop = " + i );
         * --------------------------------------------------
         */

    }

}
