
public class _18_Binary_to_decimal_Code {

    //-------------------------------------------------
    // 1. Functions to Convert Binary to Decimal (Old)
    //-------------------------------------------------
     
    public static int binToDec(int binNum) {

        int ans = 0;
        int pow = 1; // power of 2^0 = 1;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            ans = ans + (lastDigit * pow);
            binNum = binNum / 10;
            pow = pow * 2;
        } 
        return ans;
    }

    public static void main(String[] args) {

        int binNum = 1101;
        System.out.println(binToDec(binNum));
    }
  

    //-------------------------------------------------
    // 2. Functions to Convert Binary to Decimal (New)
    //-------------------------------------------------
/*  public static void binToDec(int binNum) {

        int myNum = binNum;
        int ans = 0;
        int pow = 0; 

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            ans = ans + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        } 
        System.out.println("Decimal of " + myNum + " = " + ans);
    }

    public static void main(String[] arg
        int binNum = 1101;
        binToDec(binNum);
}
 */

}
