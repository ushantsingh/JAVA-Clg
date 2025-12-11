/* java ek aise language jisme hum multiple kaam kr skte hai. EK hee time mai multiple kaamkrwa ske. 
   JAVA is multithreaded lannguage. */


   class MyThread extends Thread{
       public void run() {
           System.out.println(Thread.currentThread().getName());
           for (int i = 0; i < 5; i++) {
               System.out.println(i+" t1");
            }
        }
    }
    public class MultiThreadung {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        t1.start();// we have to use start() to start the thread
        t1.setName("Thread 1");

        try {
            t1.join();//--> it runs the the Thread whic is first called & blocks the rest Threads
        } catch (Exception e) {
            System.out.println(e);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" main");
        }
    }
}
