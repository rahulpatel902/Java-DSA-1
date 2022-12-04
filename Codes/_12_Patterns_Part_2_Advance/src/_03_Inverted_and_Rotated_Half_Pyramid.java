public class _03_Inverted_and_Rotated_Half_Pyramid {
    //Print Inverted_Rotated_Half_Pyramid
    /*
            *
           **
          ***
         ****
     *///Solve:
    static void inverted_Rotated_Half_Pyramid(int n){
        //Print rows : Outer Loop
        for(int r=1; r<=n; r++){
            //Print Spaces : Inner Loop 1
            for(int space= 1; space<=(n-r); space++){
                System.out.print(" ");
            }
            //Print Stars : Inner Loop 2
            for(int star=1; star<=r; star++){
                System.out.print("*");
            }
            //New Line or Next Row
            System.out.println();
        }
    }  
     
    public static void main(String[] args) {
        inverted_Rotated_Half_Pyramid(4);
    }
}
