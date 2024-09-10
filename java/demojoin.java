public class demojoin {
    public static void main(String[] args) {
        newThread ob1=new newThread("One");
        newThread ob2=new newThread("TWO");
        newThread ob3=new newThread("THREE");

        System.out.println("Thread one is alive: "+ob1.t.isAlive());
        System.out.println("Thread two is alive: "+ob2.t.isAlive());
        System.out.println("Thread three is alive: "+ob3.t.isAlive());
        
        try {
            System.out.println("Waiting for the threads to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
          
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrputed");
        }
        System.out.println("Thread one is alive: "+ob1.t.isAlive());
        System.out.println("Thread two is alive: "+ob2.t.isAlive());
        System.out.println("Thread three is alive: "+ob3.t.isAlive());
    }
}
class newThread extends Thread{
    String name;
    Thread t;
    newThread(String tname){
        name=tname;
        t=new Thread(this,name);
        System.out.println("new thread "+ t);
        t.start();

    }
    public void run(){
        try {
            for(int n=5;n>0;n--){
            System.out.println(name+ ": "+n);
            Thread.sleep(1000);
            }
            } catch (InterruptedException e) {
                System.out.println(name+ " interpputed");
                
            }
            System.out.println(name+ " existing");
                }
}