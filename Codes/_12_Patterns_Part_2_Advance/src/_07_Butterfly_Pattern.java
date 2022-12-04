public class _07_Butterfly_Pattern {
    // Print Butterfly Triangle
    /*
        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *

     */// Solve:


     static void butterflyPattern(int n){
        //1st Half
        for(int row=1; row<=n; row++){
            // Top-Left part : star
            for(int star=1; star<=row; star++){
                System.out.print("*");
            }
            //Top-center part : spaces
            for(int space=1; space<=(2*(n-row)); space++){
                System.out.print(" ");
            }
            //Top-Right part : star
            for(int star=1; star<=row; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Bottom Part
        for(int row=n; row>=1; row--){
            // Bottom-Left part : star
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            //Bottom-center part : spaces
            for (int space = 1; space <= (2 * (n - row)); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }





     }

 
    
     public static void main(String[] args) {
        butterflyPattern(6);
     }

}
