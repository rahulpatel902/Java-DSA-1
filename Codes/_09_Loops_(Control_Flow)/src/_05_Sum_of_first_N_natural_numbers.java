import java.util.Scanner;

public class _05_Sum_of_first_N_natural_numbers {

    public static void main(String[] args) {

        /*
         * Sum of first n natural number
         * -----------------------------
         */
        
        Scanner input = new Scanner(System.in);

        System.out.println("Input Range: ");
        int n = input.nextInt();
        int sum = 0;
        int count = 1;

        while(count <= n){
            sum = sum + count;
            count++;
        }

        System.out.println("Sum:" + sum);

        input.close();


    }
    
}
