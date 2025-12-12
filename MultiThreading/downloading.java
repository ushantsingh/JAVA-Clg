class Download extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Downloading... "+i*20+"%");
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class downloading {
    public static void main(String[] args) {
        Download d1=new Download();
        d1.start();
        for(int i=1;i<=5;i++){
            System.out.println("Timer "+" "+i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
