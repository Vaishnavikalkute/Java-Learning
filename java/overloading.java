public class overloading {
    int testval(){
       
        return 4;
    }
    int testval(int val){
       
        return val;
    }
    double testval(double val1){
       
        return val1;
    }
    public static void main(String[] args) {
        overloading obj=new overloading();

        System.out.println(obj.testval());
        System.out.println(obj.testval(55));
        System.out.println(obj.testval(99.9));
    }
}
