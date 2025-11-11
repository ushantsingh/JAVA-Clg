

class Main {
    // int a = 5; //instant variable --> iske aage static keyword nhi lga hoga 
    // static int a = 5;//. --> kisi ko kise bhi access kr skte hai 

    void Sum(int a,int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.Sum(4, 6);
        

        // Main obj = new Main();
        // System.out.println(a);
        // int a = 5;
        // System.out.println(a);


    }   
}
