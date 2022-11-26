import java.util.Scanner;

public class _04_Parameters_vs_Arguments { 


    public static int sum(int a, int b) { //Parameter or Formal Parameters
                                          //Function definition

        int sum = a + b;

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 Number: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = sum(a, b); //Arguments or Actual Parameters 
                             // => Functions call

        System.out.println("Sum is : " + sum);

        input.close();

    }
}
