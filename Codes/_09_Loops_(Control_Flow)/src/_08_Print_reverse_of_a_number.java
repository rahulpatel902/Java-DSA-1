public class _08_Print_reverse_of_a_number {
    

    public static void main(String[] args) {
        
        /*
         * Print_reverse_of_a_number
         * --------------------------------------
         * Logic used: [num / 10][num % 10]
         * ---------- 
         * 01. if we need last digit of a number then: [num % 10]
         * 02. if we want to remove the last digit of number then : [ num / 10]
         * ---------------------------------------
         * Example:
         * ------- 
              int num = 18865;
     
              while(num!=0)
              {
                 int lastDigit = num % 10;
                 System.out.print(lastDigit);
                 num = num / 10;
              }
         * -------------------------------------
         * 
         
         */
        // For loop
        int n = 10899;
        int reverse;

        for (n = 10899; n != 0; n = n / 10) {
            reverse = n % 10;
            System.out.print(reverse);
        } 

        // while loop
        int num = 18865;

        while (num != 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }

        //My method
        int m = 10899;
        int add = 0;
        String save = "";

        for (int i = 1; i <= m; i++) {
            add = m % 10;
            save = save + add;
            m = m / 10;
        }
        System.out.println(save);


     


    }
}
