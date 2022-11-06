import java.util.Scanner;

public class _14_Type_Casting {

    public static void main(String[] args) {

        /*
         * => Type casting or Narrowing Conversion or Explicit conversion
         * Byte < short < int < float < long < double
         * Float number can be converted into int
         */
         
        // Example 01 --------------

        Scanner sc = new Scanner(System.in);

        int a = (int) sc.nextFloat();

        System.out.println( a );

        // Example 02 --------------

        float num = 50.55f;

        int num2 = (int) num;

        System.out.println(num2);

        // Example 03 --------------

        char ch = 'a';
        char ch2 = 'b';
        char ch3 = 'c';


        int number = ch;
        int number2 = ch2;
        int number3 = ch3;


        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);




        sc.close();

        



    }

    

    

}
