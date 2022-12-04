public class _10_Hollow_Rhombus_Pattern {
    
    // Print Hollow Rhombus Pattern
    /*
            * * * * *
           *       *
          *       *
         *       *
        * * * * *
    */// Solve:
    static void hollow_rhombus(int n){
        //New Row
        for(int r=1; r<=n; r++){
            //Print spaces
            for(int space=1; space<=(n-r); space++){
                System.out.print(" ");
            }
            //Print star : in (r,c) cell
            for(int c=1; c<=n; c++){
                if(r==1||r==n||c==1||c==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}
