public class _12_Functions_Overloading_Using_Parameters {

    /*
     * Functions Overloading Using no of Parameters:
     * ---------------------------------------------
     * => In same class there are multiple functions with
     * same name but :
     * -> Different no of parameters
     * -> It does not depend on the return type of
     * the functions weather the return type is
     * same or different in multiple functions with same name.
     * -------------------------------------------------------
     */

     //Functions to calculate sum of two numbers
     public static int sum(int a, int b){
        return a + b;
     }

     //Functions to calculate sum of three numbers
     public static int sum(int a, int b, int c){
        return a + b + c;
     }


    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 10));
    }
}
