public class _09_Solid_Rhombus_Pattern {
    // Print Solid Rhombus Pattern
    /*
            * * * * *
           * * * * *
          * * * * *
         * * * * *
        * * * * *
    */// Solve:
    static void solid_rhombus(int n){ //[n=no.of rows]
        //Outer Loop [row=r]
        for(int r=1; r<=n; r++){
            //Print Spaces = sp
            for(int sp=1; sp<=(n-r); sp++){
                System.out.print(" ");
            }
            //Print star = st
            for(int st=1; st<=n; st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        solid_rhombus(5);
    }
}
