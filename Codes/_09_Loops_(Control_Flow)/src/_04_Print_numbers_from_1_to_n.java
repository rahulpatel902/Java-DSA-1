import java.util.Scanner;

public class _04_Print_numbers_from_1_to_n {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        int num = 1;
        
        System.out.println("Input Range");
        int n = input.nextInt();

        while(num <= n){
            System.out.println(num);
            num++;
        }


        input.close();
    }
    
}
