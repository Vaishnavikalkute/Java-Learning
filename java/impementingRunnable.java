

public class impementingRunnable implements Runnable {
    
    Thread t;
    int i;
    String s[]={"welcome","to","java"};

    impementingRunnable(){
        t=new Thread(this,"runnable interface");
        System.out.println("Thread is "+ t);
        t.start();

    }
    public void run(){
        String name=t.getName();
        for (int i=0;i<s.length;++i){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            System.out.println(name+": "+s[i]);
        }
    }

}
