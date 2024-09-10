// public class computethreads extends Thread {
//     public void run(){
//         System.out.println("thread started");
//     }
//     public int Square(int vale){
//         int val=vale*vale;
//         return val;
//     }
//     public int Cube(int vale){
//         int val=vale*vale*vale;
//         return val;
//     }
//     public static void main(String[] args) {
//         Thread t1=new computethreads();
//         Thread t2=new computethreads();
//         Thread t3=new computethreads();
//         t1.setName("Loop thread");
//         t2.setName("Square even thread");
//         t3.setName("cube odd thread");

//         try {

//             for(int n=0; n<10; n++){
//                 if(n%2==0){
//                     t2.start();
//                     int sqr = t2.Square();
//                     System.out.println("Sqr: "+sqr);

//                 }
//                 else{
//                     t3.start();
//                     int cub = t2.cube();
//                     System.out.println("Sqr: "+cub);
//                 }
//                 Thread.sleep(1000);
//             }
//         } catch (InterruptedException e) {
//         }
//     }
// }

/* so you cannot use thread cretion in loop it will load the therd as there is no logic to end the threads
 * 
 * 
 */



public class ComputeThreads extends Thread {
    private int value;
    private String operation;
    
    public ComputeThreads(int value, String operation) {
        this.value = value;
        this.operation = operation;
    }

    @Override
    public void run() {
        int result;
        if ("square".equals(operation)) {
            result = Square(value);
            System.out.println("Square of " + value + ": " + result);
        } else if ("cube".equals(operation)) {
            result = Cube(value);
            System.out.println("Cube of " + value + ": " + result);
        }
    }

    public int Square(int vale) {
        return vale * vale;
    }

    public int Cube(int vale) {
        return vale * vale * vale;
    }

    public static void main(String[] args) {
        try {
            for (int n = 0; n < 10; n++) {
                ComputeThreads thread;
                if (n % 2 == 0) {
                    thread = new ComputeThreads(n, "square");
                } else {
                    thread = new ComputeThreads(n, "cube");
                }
                thread.start();
                thread.join();  // Wait for the thread to complete
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
