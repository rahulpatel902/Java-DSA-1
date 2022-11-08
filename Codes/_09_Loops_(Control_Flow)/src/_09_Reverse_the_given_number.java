public class _09_Reverse_the_given_number {

    public static void main(String[] args) {
        

        /*
         * Reverse_the_given_number
         * ------------------------
         */
              int num = 18865;
              int rev = 0;
      
              while (num > 0) {
                  int lastDigit = num % 10;
                  rev = (rev*10)+lastDigit;
                  num = num / 10;
              }
      
              System.out.println(rev);
    }
    
}
 