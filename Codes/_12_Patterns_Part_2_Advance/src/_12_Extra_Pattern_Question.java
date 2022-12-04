public class _12_Extra_Pattern_Question{
    // Print Number Pyramid Pattern
    /*
             1
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5
    
     */// Solve:   
/*   static void  number_pyramid(int n){ //n=5
        for(int r=1; r<=n; r++){
            //spaces
            for(int space=1; space<=(n-r); space++){
                System.out.print(" ");
            }
            //star
            for(int star=1; star<=(2*r-1); star++){
                if(star%2!=0){
                    System.out.print(r);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }

 */

         // Print Number Pyramid Pattern
    /*
             1
           2 1 2 
         3 2 1 2 3 
       4 3 2 1 2 3 4
     5 4 3 2 1 2 3 4 5
        
     */// Solve:  
    static void palindromic_pattern(int n){
        for(int r=1; r<=n;r++){
            //spaces
            for(int sp=1; sp<=(n-r); sp++){
                System.out.print(" ");
            }
            //Descending num
            for(int num=r; num>=1; num--){
                System.out.print(num);
            }
            //Ascending
            for(int num=2; num<=r; num++){
                System.out.print(num);
            }
            System.out.println();
        } 
     }


    public static void main(String[] args) {
        palindromic_pattern(3);
    }
}

