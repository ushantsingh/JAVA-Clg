// You Tube Channel 


class Youtube {
    private String channelName = "AUGamming";
    private int Subs = 0;
    
    public String getChannelName() {
        System.out.println(channelName);
        return channelName;
    }
    // public void setChannelName(String channelName) {
    //     this.channelName = channelName;
    // }
    public int getSubs() {
        return Subs;
    }
    public void setSubs(int subs) {
        if (subs > 0) {
            Subs += subs;
            System.out.println("Subscriber : "+Subs);
        }
    } 

    public void setUnsubs(int Unsubs) {
        if (Unsubs > 0 && Subs >= Unsubs) {
            Subs -= Unsubs;
            System.out.println("Unsubscribe : "+Subs);
        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        Youtube y1 = new Youtube();
        y1.getChannelName();
        System.out.println(y1.getSubs());
        y1.setSubs(4);
        y1.setUnsubs(3);
    }
}
