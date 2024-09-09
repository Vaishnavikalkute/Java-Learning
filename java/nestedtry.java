public class nestedtry {
    public static void main(String[] args) {
        try {
            int a=args.length;

            int b=42/a;
            try {
                if (a==1) a=a/(a-a);
                if (a==2){
                    int c[]={1};
                    c[42]=99;
                   
                }
            } 
            catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Error"+ e);
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("Error"+ e );
        }
        finally{
            System.out.println("I work everytime");
        }
    }
}
