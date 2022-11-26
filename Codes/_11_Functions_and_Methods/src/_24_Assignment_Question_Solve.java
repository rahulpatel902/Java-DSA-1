public abstract class _24_Assignment_Question_Solve {

    // Q1: Write a Java method to compute the average of three numbers
    // Solve:
/* 
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {

        System.out.println(average(3, 5, 7));
    }
 */

    //Q2: Write a method named isEven that accepts an int argument. The method 
    //    should return true if the argument is even, or false otherwise. 
    //    Also write program to test your method.
    //Solve: 
/* 
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 5;

        if (isEven(n)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }

    }
 */

    /*
     * Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)
     * -------------------------------------------------------------
     * A number is called a palindrome if the number is equal to the 
     * reverse  of a number e.g., 121 is a palindrome because the 
     * reverse of 121 is 121 itself. On the other hand, 321,is not 
     * a palindrome because the reverse of 321 is 123, which is 
     * not equal to 321.
     * -------------------------------------------------------------
     */
    //Solve:
/* 
    public static boolean isPalindrome(int n) {
        int ori = n;
        int rev = 0;

        while (n > 0) {
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n = n / 10;
        }

        return (ori == rev);
    }

    public static void main(String[] args) {
        int n = 221;

        if (isPalindrome(n)) {
            System.out.println("Number: " + n + " is a Palindrome");
        } else {
            System.out.println("Number: " + n + " is not a Palindrome");
        }
    }
 */
    /*
     * Q4:Write a Java method to compute the sum of the digits in an integer.
     */
    //Solve: 
/*    
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args){
        int n  = 132;
        System.out.println(sumOfDigits(n));
    }
 */
    /*
     * Question 5 : READ & CODE EXERCISE
     * Search about(Google) & use the following methods of the Math class in Java:
     * a. Math.min( )
     * b. Math.max( )
     * c. Math.sqrt( )
     * d. Math.pow( )
     * e. Math.avg( )
     * f. Math.abs( )
     * Free reading resource (https://www.javatpoint.com/java-math)
     * Please feel free to look for more resources/websites on your own.
     * 
     */
    //Solve:
    public static void main(String[] args) {
        int a = 4;
        int b = 2;

        System.out.println(Math.min(a, b)); //b=2
        System.out.println(Math.max(a, b)); //a=5
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, b)); // a^b = 4^2=16
        System.out.println(Math.abs(-a));
    }

    




}
