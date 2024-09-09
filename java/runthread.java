public class runthread extends Thread{
// public class runthread implements Runnable{
    public void run(){
        System.out.println("Thread 1 is created");

    }
    public static void main(String[] args) {
        Thread t1=new Thread(new runthread());
        t1.start();
        System.out.println("Thread 1 is created and is alive : "+t1.isAlive());


    }
}
