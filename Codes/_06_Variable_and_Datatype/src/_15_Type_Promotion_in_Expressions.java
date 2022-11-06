public class _15_Type_Promotion_in_Expressions {

    public static void main(String[] args) {
        /*
         * Type_Promotion_in_Expressions
         * ------------------------------
         * Rule 1. Java automatically promotes each byte,short,or char operand to int
         * when evaluating an expression.
         * -------------------------------------------
         * Rule 2. If one operand is long,float or double the whole expression is
         * promoted to long,float,or double respectively.
         */

 
        // Example 01 - Based On Rule 01

          // char a = 'a';
          // char b = 'b';

          // char c = (char) (a - b);
          // System.out.println(c);

          // System.out.println((int)(a));
          // System.out.println((int)(b));
          // System.out.println(a);
          // System.out.println(b-a);

          // short a = 5;
          // byte b = 25;
          // char c = 'c';
          // byte bt = (byte) (a + b + c);

          // System.out.println(bt);


          // Example 01 - Based On Rule 02

          // int a = 10;
          // float b = 20.25f;
          // long c = 25;
          // double d = 30;
  
          // double sum = a+b+c+d;

          // System.out.println(sum);
          
        // Example 03 - Based On Type Conversion

          // byte b = 5;
          // byte a = (byte) (b * 2);

          // System.out.println(a);


        
    }
    
}
