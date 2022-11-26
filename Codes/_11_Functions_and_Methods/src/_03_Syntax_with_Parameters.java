import java.util.Scanner;

public class _03_Syntax_with_Parameters {

    /*
     * [Syntax with Parameters]
     * -----------------------------
     * returnType functionName(type param1, type param2){
     * \\Body
     * return statement;
     * }
     */

    /*
     * [Sample-Question in-a&b,out-sum of a&b(using Function)]
     * -------------------------------------------------------
     */

    public static int sum(int a, int b) {

        int sum = a + b;

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 Number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = sum(a, b);
        System.out.println("Sum is : " + sum);

        input.close();

    }
}