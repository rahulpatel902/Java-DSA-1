public class _21_Method_Scope {

    /*
     * --------------------
     * Scope: Method Scope
     * -------------------------------------------------------
     * (1) In any function if we define a variable in it then:
     *   => we can use that variable below that lines from where 
     *      the variable is declared
     *   => but we can't use that variable above the lines from
     *      where that variable is declared
     * --------------------------------------------------------
     * (2) we can't use a variable of a particular function in 
     *     any other functions
     * --------------------------------------------------------
     */

    //Example for (1)
    public static void main(String[] args) {

    //  System.out.println(s); //Error-> s is not declared above
        int s = 45;             // s is declared
        System.out.println(s); // Correct
    }

    // Example for (2)
    public static void fun1() {
        int var = 25;
        System.out.println(var);
    }

    public static void fun2(){
    //  System.out.println(var); //Error

       // it will give error because var is no defined in this function;
       // var is define in fun1 method which can't be used here or any other functions

    }



}
