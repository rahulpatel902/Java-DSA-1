public abstract class _04_Inverted_Half_Pyramid_with_Number {
    
    // Print Inverted_Half_Pyramid_with_Number
    /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
     */// Solve:

    static void inverted_half_pyramid_with_Number(int n){
        //Outer Loop : new row -> n times
        for(int r =1; r<=n; r++){
            //Inner-Loop:Print num -> n-r times in each row
            for(int num=1; num<=(n-r+1); num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_pyramid_with_Number(5);
    }
}
