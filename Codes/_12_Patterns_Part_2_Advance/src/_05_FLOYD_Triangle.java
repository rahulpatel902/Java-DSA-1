public class _05_FLOYD_Triangle {
    // Print FLOYD'S Triangle
    /*
     * 1 
     * 2  3
     * 4  5  6 
     * 7  8  9  10
     * 11 12 13 14
     */// Solve:

    static void floyd_triangle(int n){
        int num = 1;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; c++){ 
                System.out.print(num + " "); 
                num++;
            }
            System.out.println();
        }
    }
    
     public static void main(String[] args) {
        floyd_triangle(5);
     }
}
