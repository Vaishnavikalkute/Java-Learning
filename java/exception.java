/*
 * differient type of exceptions
 * user-defined exception
 * built-in exception
 * 
 ***built-in exception types
 * 1. checked exception
 * 2.unchecked exception (1.arithmeticexception, 2.nullpointerexception)
 * 
 ***user-defined exception
 * printStackTrace()- prints the excpetion infor in te foramt of the name of the exception
 * description of the exception,stack
 * -----syntax-----
 * try{
 *  //block of the code monitior for error
 * }
 * catch(exceptionType1 exOb){
 * //excpetion handler for exceptiontyep1
 * }
 * catch(exceptionType2 exOb){
 * //excpetion handler for exceptiontyep2
 * }
 * //...
 * finally{
 * //code to exceute after try catch
 * }
 * 
 * 
 * 
 * 
 */



public class exception {

    public static void main(String[] args) {
        int a=10,b=5,c=5;
        // int x=a/(b-c); //wont work will give you arithmeticexception
        try {
            int x=a/(b-c);
            System.out.println("division works?");
        }
         catch (ArithmeticException e) {
            System.out.println("Yeah got the exception");
            
        }
        System.out.println("Done....");
    }
    
}
