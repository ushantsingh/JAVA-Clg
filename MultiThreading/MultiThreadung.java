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
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" main");
        }
    }
}
