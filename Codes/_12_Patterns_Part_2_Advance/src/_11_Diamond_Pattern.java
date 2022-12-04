public class _11_Diamond_Pattern {
    // Print Diamond Pattern
    /*
               *
             * * *
           * * * * *
         * * * * * * *
         * * * * * * *
           * * * * *
             * * *
               *
    
     */// Solve:
    static void diamond_pattern(int n){
        
        for(int r=1; r<=n; r++){
            //spaces
            for(int space=1; space<=(n-r); space++){
                System.out.print(" ");
            }
            //star
            for(int star=1; star<=(2*r-1); star++){
                System.out.print("*");
            }
            //next line
            System.out.println();
        }

        for(int r=n; r>=1; r--){
            //spaces
            for(int space=1; space<=(n-r); space++){
                System.out.print(" ");
            }
            //star
            for(int star=1; star<=(2*r-1); star++){
                System.out.print("*");
            }
            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond_pattern(6);       
    }
}
