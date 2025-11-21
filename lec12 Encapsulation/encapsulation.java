

class Atm {
    private int totalBalance = 10000000;
    
    public void getTotalBal() {
        System.out.println(totalBalance);
    }

    public void setBalance(int amount) {
        if (amount > 0 && totalBalance > amount) {
        totalBalance -= amount;
        System.out.println("Total Balance : "+ totalBalance);
    } else {
        System.out.println("Insufficient Balance !");
    }
        
}
    public void setDeposit(long amount){
        if(amount>0){
            totalBalance+=amount;
            System.out.println("Total Balance : "+totalBalance);
        }
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Atm s1 = new Atm();
        s1.getTotalBal();
        s1.setBalance(10000000);
        s1.setDeposit(392739690);
    }
}
