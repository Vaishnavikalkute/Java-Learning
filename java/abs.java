/*
 a method that is declared as abstract adnd does not have a impementation is knoe as abstract
 */
public class abs {
    public static void main(String[] args) {
        Bike b=new Honda();
        b.run();
        Bike v=new vera();
        v.run();
    }

}
abstract class Bike{
    abstract void run();
}
class Honda extends Bike{
    void run(){
        System.out.println("hey");
    }
}

class vera extends Bike{
    void run(){
        System.out.println("hey vera");
    }
}
// class audi extends Bike{
//     void run2(){
//         System.out.println("hey vera");
//     }
// }

