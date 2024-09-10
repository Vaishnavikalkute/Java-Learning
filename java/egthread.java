public class egthread extends Thread{
    public void run(){
        System.out.println("Start running");
    }
    public static void main(String[] args) {
        Thread t1=new egthread();
        System.out.println("Name of t1: "+t1.getName());
        System.out.println("Id of t1: "+t1.getId());
        t1.start();
        Thread t2=Thread.currentThread();
        System.out.println("Current thread: "+t2);
        System.out.println("Name of t2: "+t2.getName());
        t2.setName("Thread 55");
        System.out.println("Name of t2: "+t2.getName());
        try {
            for(int n=5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
            
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

    }
}

