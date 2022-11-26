public class _13_Functions_Overloading_Using_Datatype_of_Parameters {
    /*
     * Functions Overloading Using Datatype of Parameters:
     * ----------------------------------------------------
     * => In same class there are multiple functions with
     * same name but :
     * -> Different Datatype of the parameters
     * -> It does not depend on the return type of
     * the functions weather the return type is
     * same or different in multiple functions with same name.
     * -------------------------------------------------------
     */

    // Function to calculate integer sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // Function to calculate float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 4.8f));
    }
}
