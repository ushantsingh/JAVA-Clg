public class functions {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");//by default 16 characters ke space create ho jati hai

        // 1. append()
        str.append("j");
        // System.out.println(str);

        // 2. insert()
        str.insert(2, "byee");
        // System.out.println(str);

        // 3. replace()
        str.replace(1, 4, "ushant");
        // System.out.println(str);

        // 4. delete()
        // str.delete(4, 6);
        // System.out.println(str);

        // // 5. deleteCharAt()
        // str.deleteCharAt(4);

        // // 6.reverse()
        // str.reverse();
        // System.out.println(str);

        // 7.indexOf()
        // str.indexOf("l");
        // System.out.println(str);

        // // 8.length()
        // str.length();
        // System.out.println(str);

        // 9. setcharAt();
        // str.setCharAt(5, 'y');
        // System.out.println(str);

        
    }
}
