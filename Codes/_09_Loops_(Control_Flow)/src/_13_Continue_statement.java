public class _13_Continue_statement {
    public static void main(String[] args) {
        
        /*
         * Continue Statement
         * ------------------
         * it's used to skip iteration
         * ---------------------------
         * syntex: continue;
         * -----------------
         

              for(int i = 1; i <= 5; i++){
                 if(i == 3){
                     continue;
                 }
                 System.out.println(i);
              }
     
              System.out.println("3 is not printed");

        
              
         */
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("3 is not printed");



    }
    
}
