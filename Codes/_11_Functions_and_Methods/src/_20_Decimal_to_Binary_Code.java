public class _20_Decimal_to_Binary_Code {

    // ----------------------------------------------
    // Functions to convert Decimal to Binary (Old)
    // ----------------------------------------------

 /* 
    public static int decToBin(int decNum) {

        int ans = 0;
        int pow = 1; // Power of 10^0 = 1;

        while (decNum > 0) {
            int parity = decNum % 2;
            ans = ans + (parity * pow);
            pow = pow * 10;
            decNum = decNum / 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        int decNum = 13;

        System.out.println(decToBin(decNum));
    }
 */

    //----------------------------------------------
    // Functions to convert Decimal to Binary (New)
    //----------------------------------------------
 /* 
    public static void decToBin(int decNum) {

        int myNum = decNum;
        int ans = 0;
        int pow = 0;

        while (decNum > 0) {
            int parity = decNum % 2;
            ans = ans + (parity * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }

        System.out.println("Bin Number of " + myNum + " = " + ans);
    }

    public static void main(String[] args) {
        int decNum = 12;
        decToBin(decNum);
    }
*/
 
}
