public class _01_Intro_to_Nested_Loops_Star_Pattern {

    public static void main(String[] args) {

        /* Print Star Pattern */
        /*
         *  *
         *  **
         *  ***
         *  ****
         * 
         */
        int num = 5;
        for (int line = 1; line <= num; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }

}
