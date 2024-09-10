import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistMain{
    public static void main(String[] args) {
        Book b1=new Book(1, "book1", "hcverma");
        Book b2=new Book(2, "book2", "hcverma");
        Book b3=new Book(3, "book2", "hcverma");

        ArrayList<Book> a=new ArrayList<Book>();

        a.add(b1);
        a.add(b2);
        a.add(b3);
// to iterate through the collection.
        Iterator itr=a.iterator();
        while (itr.hasNext()) {
            Book b =  (Book)itr.next();
            b.display();
            
        }

        Book c =a.get(1);
        System.out.println(c.id+" "+c.name+" "+c.author);
    }
}
class Book {
    int id;
    String name,author;

    Book(int i,String n,String a){
        id=i;
        name=n;
        author=a;

    }
    void display(){
        System.out.println("Book info : "+id+" "+name+" "+author);
    }

}
