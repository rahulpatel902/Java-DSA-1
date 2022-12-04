public class _06_Triangle_0_1 {
    // Print 0 1 Triangle
    /*
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     * 1 0 1 0 1 
     */// Solve:

    static void triangle_0_1(int n){
        //Outer Loop : runs n times
        for(int r=1; r<=n; r++){
            // Inner Loop : runs r times
            for(int c=1; c<=r; c++){
                if((r+c)%2!=0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

     public static void main(String[] args) {
        triangle_0_1(5);
     }
}
