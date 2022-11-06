

public class _17_Practice_Question_Variable {

    public static void main(String[] args) {
        
        /*
         * --------------------------------
         * VARIABLES & DATA TYPES QUESTIONS
         * --------------------------------
         */

//*     ----------------------------------------------------------
        /*
         * Question - 01 :
         * In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
         * (Hint : Average of N numbers is sum of those numbers divided by N) 
         */

        //* Solution - 01
        /* 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 Numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        double avg = (a + b + c) / 3;

        System.out.println("average: " + avg);
        */

//*    ----------------------------------------------------------

        /*
         * Question - 02:
         * In a program, input the side of a square. You have to output the area of the
         * square.
         * (Hint : area of a square is (side x side))
         */ 

        // * Solution - 02
        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side of the Square: ");
        int side = input.nextInt();
        int area = side*side;
        System.out.println("Area of the square is: " + area);
        */

//*    ----------------------------------------------------------
     
        /*
         * Question 03: 
         * Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. 
         * You have to output the total cost of the items back to the user as their bill.
         * (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
         */

        // * Solution - 03 // 18% gst tax
        /* 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 3 Item Prices: ");
        float pencil_Price = input.nextFloat();
        float pen_Price = input.nextFloat();
        float eraser_Price = input.nextFloat();

        float original_Cost = pencil_Price + pen_Price + eraser_Price;
        float gst_Amount = (original_Cost * 18) / 100;
        float net_Cost = original_Cost + gst_Amount;


        System.out.println("Original Cost: " + original_Cost);
        System.out.println("18% GST Tax Amount: " + gst_Amount);
        System.out.println("Net Cost: " + net_Cost);
        */

//*    ----------------------------------------------------------

        /*
         * Question 04:
         * What will be the type of result in the following Java code?
         * byte b = 4;
         * char c = 'a';
         * short s = 512;
         * int i = 1000;
         * float f = 3.14f;
         * double d = 99.9954;
         * 
         * result = (f*b) + (i%c) - (d*s);
         */

        // * Solution - 04
        // * Largest Datatype will be the type of 'result' variable
           
        
        /*  
        byte b = 4; 
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
         
        Double result = (f*b) + (i%c) - (d*s);

        System.out.println(result);
        */
    
// *   ----------------------------------------------------------

        /*
         * Question 05:
         * : (Advanced) Will the following statement give any error in Java?
         * [ int $ = 24;]
         * 
         */

        // * Solution - 05
        /*
         * No, the statement will not give any error.
         * Names of variables are called identifiers in Java. Identifier rule says,identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).
         * According to the rule the given variable name is a valid identifier.
         */

        // int $ = 24;
        // System.out.println($);



    }

}