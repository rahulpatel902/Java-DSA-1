public class _04_else_if {

    public static void main(String[] args) {
        
        /*
         * Else if Statement
         * -----------------
         * Syntex
         * -------
           if(condition 1){
                //codes
           }
           else if(condition 2){
                //codes
                //else if block is checked when the above if statement is false
           }
           else{
                //codes
           }
         * --------------------------------------------------
         * Example
         * -------
           int age = 13;

           if (age>=18){
               System.out.println("Adults");
           }
           else if (age >= 13 && age < 18){
               System.out.println("Teenager");            
           }
           else{
               System.out.println("Child");              
           }
         */
           int age = 13;

           if (age>=18){
               System.out.println("Adults");
           }
           else if (age >= 13 && age < 18){
               System.out.println("Teenager");            
           }
           else{
               System.out.println("Child");              
           }
    }
    
}
