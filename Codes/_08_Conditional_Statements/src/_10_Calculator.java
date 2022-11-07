import java.util.Scanner;

//import java.util.Scanner;

public class _10_Calculator {
    
    public static void main(String[] args) {
        

        /*
         * Calculator
         * ----------
         * Using Switch
         */

        /* 
        * Example
        
         Scanner input = new Scanner(System.in);

         System.out.println("Input a and b: ");
         int a = input.nextInt();
         int b = input.nextInt();
         System.out.println("Input Operator ");
         char operator = input.next().charAt(0);

         switch(operator){

            case '+' : System.out.println(a + b); break;
            case '-' : System.out.println(a - b); break;
            case '*' : System.out.println(a * b); break;
            case '/' : System.out.println(a / b); break;
            
            case '%' : System.out.println(a % b); break;

            default: System.out.println("Invalid Operator");
         }   
        */
            Scanner input = new Scanner(System.in);

            System.out.println("Input 2 Numbers: ");
            int a  = input.nextInt();
            int b = input.nextInt();

            System.out.println("Input Operator: ");
            char operator = input.next().charAt(0);

            switch(operator){
               
              case '+': System.out.println(a + b); break;  
              case '-': System.out.println(a - b); break;  
              case '*': System.out.println(a * b); break;  
              case '/': System.out.println(a / b); break;  
              case '%': System.out.println(a % b); break;  
              default : System.out.println("Invalid Operator");

            }




            input.close();


































         
    }
}
