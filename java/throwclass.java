/*
 * java throw is a key word that is been used in the signature 
 * of method to indicate that this methid might throw one of the exceptions.
 * the colar to these methods as to handle the exception using a try catch block
 * 
 */


public class throwclass {
    static void demo1(){
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside the demo1");
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            demo1();
        } catch (NullPointerException e) {
            System.out.println("Recaught: "+ e);
        }
    }
}
