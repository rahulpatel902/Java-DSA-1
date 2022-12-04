public class _01_Hollow_Rectangle_Patterns {

    //Print Hollow Rectangle Pattern
    /*
        * * * * *
        *       * 
        *       * 
        * * * * *
     *///Solve:

    static void p1_hollow_rectangle(int row, int col){      

         for(int r=1; r<=row; r++){
            for(int c = 1; c<=row+1; c++){
                    //cell - (r,c)
                if(r==1||r==row||c==1||c==col){
                    //Boundary cells 
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }

    public static void main(String[] args){
        
        p1_hollow_rectangle(4, 5);

    }
}
