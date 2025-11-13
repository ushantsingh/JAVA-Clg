
class Device {
    void Power() {
        System.out.println("Power On");
    }
}

class Laptop extends Device {
    void Boot() {
        System.out.println("Booting the laptop");
    }
}

class GamingLaptop extends Laptop {
    void startgame(){
        System.out.println("Game started");
    }
}


public class Question_4 {
    public static void main(String[] args) {
        GamingLaptop g = new GamingLaptop();
        g.Power();
        g.startgame();
        g.Boot();
    }
}
