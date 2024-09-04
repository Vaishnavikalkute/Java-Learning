public class Bank {
    int getRateofIntrest(){
       
        return 4;
    }
    public static void main(String[] args) {
        Icici a=new Icici();
        axis b=new axis();
        System.out.println(a.getRateofIntrest());
        System.out.println(b.getRateofIntrest());
    }
}
class Icici extends Bank{
    int getRateofIntrest(){
       
        return 4;
    }
    
}
class axis extends Bank{
    int getRateofIntrest(){
       
        return 7;
    }
}