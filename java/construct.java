public class construct {
    String name;
    int age;

    public construct(String name,int age){
        this.name=name;
        this.age=age;
    }
    
    void display(){
        System.out.println("name "+name+ "age: "+age);
    }
    
    public static void main(String[] args) {
        System.out.println("Hi");
        construct p=new construct("Alice",30);
        p.display();
    }
}
