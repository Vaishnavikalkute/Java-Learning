public class Planet{
    

    public static void main(String[] args) {
        System.out.println("Lets start");
        Cat ct=new Cat();
        ct.meow();
        ct.eat();
    }
}


class Animal{
    void eat(){
        System.out.println("This animal is eats food");
    }
}


// Inheritence 

class Cat extends Animal{
    void meow(){
        System.out.println("I meow only");
    }
}

