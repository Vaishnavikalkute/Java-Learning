public class overriding {
    public static void main(String[] args) {
        System.err.println("Start");
        bike obj1=new bike();
        obj1.run();
        bike1 obj2=new bike1();
        obj2.run();
        vehicle vh=new vehicle();
        vh.run();
    }
}
class vehicle{
    void run(){
        System.out.println("ok");
    }
}
class bike extends vehicle{
    void run(){
        System.out.println("hey");
    }
}
class bike1 extends bike{
    void run(){
        System.out.println("haaaa");
    }
}
