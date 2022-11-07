
//import java.util.Scanner;

public class _11_Conditional_Questions {

    public static void main(String[] args) {
        

       /*
        * Conditional Question
        * --------------------
        */
        
        /*
        * Question 1: 
        * Write a Java program to get a number from the user and print whether it is positive or negative
        */

        //* Solution-01
        /*
         Scanner input = new Scanner(System.in);
         System.out.println("Input a Number");
         int a = input.nextInt();

         if(a >= 0){
            System.out.println("It's a Positive Number: " + a);
         }
         else{
            System.out.println("It's a Negative Number: " + a);
         }
        */


        /*
         * Question 2:
         * Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
         * --------------------
         * double temp = 103.5;
         * --------------------
         */

        //* Solution-02
        /*
          double temp = 93.5;

          if(temp > 100){
            System.out.println("You have a fever");
          }
          else{
            System.out.println("You don't have a fever");
          }
        */


        /*
         * Question 3:
         * Write a Java program to input week number(1-7) and print day of week name using switch case.
         */

        //* Solution-03

        /*
          int weekNum = 5;
          String day = "";
          
          switch(weekNum){
            case 1 : System.out.println("Monday");   break;
            case 2 : System.out.println("Tuesday");  break;
            case 3 : System.out.println("Wednusday");break;
            case 4 : System.out.println("Thrusday"); break;
            case 5 : System.out.println("Friday");   break;
            case 6 : System.out.println("Saturday"); break;
            case 7 : System.out.println("Sunday");   break;
            default: System.out.println("Invalid");
          }
          */
        /*
         * Question 4:
         * What will be the value of x & y in the following program
         * ------------------------------------
           int a = 63, b = 36;
           boolean x = (a < b ) ? true : false;
           int y= (a > b ) ? a : b;
         * ------------------------------------
         */

        //* Solution-04

        /*
         x = false
         y = 63
        */


        /*
         * Question 5:
         * Write a Java program that takes a year from the user and print whether that year is a leap year or not.
         * ------------------------------------
         * Hint
         * ----
         * year / 4 = year / 100 = y / 400 = leap year
         * year !/ 4 = not leap year
         * year !/ 400 = not leap year
         * 
         */

        //* Solution-05

        /*


        //* method 01

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = input.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 ==0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not leap year");
        }

        // * method 01

        boolean x = year % 4 == 0;
        boolean y = year % 100 != 0;
        boolean z = year % 100 == 0 && year % 400 == 0;

        if(x && (y || z)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }

        input.close();

        */


          // Method 01
/*         Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if(year%4==0){
          if(year % 100==0){
             if(year%400==0){
              System.out.println("leap Year");
             }
             else{
              System.out.println("Not a leap year");
             }
          }
          else{
            System.out.println("Leap Year");
          }
        }
        else{
          System.out.println("Not a Leap Year");
        }

        input.close();
 */

      // Method 02
/*       
      int year = 2028;
      boolean x = year%4==0;
      boolean y = year%100!=0;
      boolean z = (year%100==0) && (year%400==0);

      if(x && (y || z)){
        System.out.println("Leap Year");
      }
      else{
        System.out.println("Not a Leap Year");
      }

 */
















         
    }
    
}
