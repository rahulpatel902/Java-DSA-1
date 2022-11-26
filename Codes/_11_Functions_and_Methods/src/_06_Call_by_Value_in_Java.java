public class _06_Call_by_Value_in_Java {

    public static void swap(int a, int b) { //Copy of argument value
        // Swap - value exchange - (1)
        int temp;
        temp = a; // temp = 5           
        a = b; // a = 10
        b = temp; // b = 5

        System.out.println("a = " + a); //a=10
        System.out.println("b = " + b); //b=5

    //In this swap function all changes will be within this function only
    //Changes will no go out side of this function bloack 
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        swap(a, b);//real value 
     //makes a copy of real value & passes to function definition

        System.out.println("a = " + a); //a=5
        System.out.println("b = " + b); //b=10

    }

    /*
     * Call by Value [Java]:
     * => Copied value is passed to the function
     * => Changes made in a function will not be shown
     *    outside of that function
     * -----------------------------------------
     * Call by Reference [C++]
     * => Original value is passes to the function
     * => Changes made in a function will be shown out 
     *    side of that function too
     */





}
