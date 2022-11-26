public class _02_Syntax_Function_Code_Demo {
    
    /*
     * ----------------
     * Functions Syntax
     * ----------------
     * returnType functionName () {
     * 
     *  \\Body
     *   return;
     * }
     * ------------------------------
     */

    //Function Example
    public static void printHelloWold() { // Print HelloWold Function
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello Wold");
        }
        return;
    }
    
    public static void main(String[] args) {
    
        printHelloWold(); // Function Call
    }
}
