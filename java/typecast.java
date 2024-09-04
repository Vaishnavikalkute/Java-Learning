
/* typecasting -class typecasting is hell */


public class typecast {


    public static void main(String[] args) {
        // int a=13;
        // double d=23.55;
        // System.out.println(a);
        // System.out.println(d);

        // // implicit typecasting or upcasting(narrow to wider)
        // long l=a;
        // float f=a;

        // System.out.println(l);
        // System.out.println(f);

        // // implicit typecasting or downcasting ( wider to narrow)
        // // short val = l;
        // double val2 = f;

        // // System.out.println(val);
        // System.out.println(val2);


        // // Animal animal=new Cat();
        // // Cat ct=(Cat)animal;

        // //


        // upcating

        Animal p=new Cat();
        p.show1();

        // Cat ct=(Cat)p;
        // ct.show();

    }
}
/*
 * Parent p = new Child()    - upcasting
 * Child c = new Parent()   --trying downcasting but wont work
 * 
 * 
 * Parent p=new Child();
 * Child c=(child)p;  - downcating work as p is refers child
 */

class Animal{
    // base class
    void show1(){
        System.out.println("hi i am parent");
    }
}
class Cat extends Animal{

    // dericed class

    void show(){
        System.out.println("hi i am child");
    }

}