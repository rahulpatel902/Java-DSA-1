public class _02_Inverted_Star_Pattern {
    public static void main(String[] args) {
        
        /*Inverted-Star Pattern*/
        /*
         * ****
         * ***
         * **
         * *
         * 
         */
        int total_Line = 4;
        for (int line = total_Line; line >= 1; line--) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
    }       

}