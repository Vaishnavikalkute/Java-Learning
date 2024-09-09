
import java.util.Random;

public class Handleerror {
    public static void main(String[] args) {
        int a=0,b=0,c=0,z;
        int arr[]={1};
        Random r=new Random();
        for(int i=0;i<32;i++){
            try {
                b=r.nextInt();
                c=r.nextInt();
                a=12345/(b/c);
                arr[42]=99;
            
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
                a=0 ;//set a to zero and continue
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Arry is out of bound"+e);
                
            }
            System.out.println("a: "+a);
        }
    }
}
