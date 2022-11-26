public class _22_Block_Scope {


    /*
     * Scope: Block Scope {scope}
     * --------------------------
     * 1.Any variable is under a block of code(under {} braces)
     *   then the scope of that variable is under that block only
     * ----------------------------------------------------------
     * 2.That variable can only be used under that block only
     * -----------------------------------------------------------
     * 3.It can't be used outside of that block where that 
     *   variable is used
     * ----------------------------------------------------------
     */





    public static void main(String[] args) {

     //Example A ------------------------------------------
    //-------------------------------------------------------
        int p = 10; 
        // p variable is under main function scope so it can be
        // used any where inside the main function even if it's
        // under a block inside the main function
        {
            System.out.println(p); // p variable has main function scope
                                   // so it can be used here inside the block {....}

            int s = 45;
            System.out.println(s);
        }

    //  System.out.println(s); //Error

        // ^ It will give error because s is declared inside a block of 
        //   code which can't be used outside of that block

        System.out.println(p);
    //----------------------------------------------------------


    //Example B  ----------------------
    //-----------------------------------

    for(int i = 1; i<=2; i++){
        System.out.println(i);
    }
    // System.out.println(i); //Error

    // ^ It will give error because i variable is declared inside a block of 
    //   that for loop which can't be used outside of that for loop

    //------------------------------------



    }
}
