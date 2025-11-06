

public class functions {
    public static void main(String[] args) {
        // // 1. name.length() --> Returns length of a string name

        // String name="Ushant";
        // int value =name.length();
        // System.out.println(value);

        // // 2. name.tolowercase() 

        // String lstring =name.toLowerCase();
        // System.out.println(lstring);

        // // 3. name.touppercase()

        // String upper=name.toUpperCase();
        // System.out.println(upper);

        // // 4. name.trim()

        // String nonTrimmedString ="    Ushant    ";
        // System.out.println(nonTrimmedString);
        // String trimmed =nonTrimmedString.trim();
        // System.out.println(trimmed);

        // // 5. name.substring(int start) -->returns a substring from start to the end substring(3) returns "ant".

        // System.out.println(name.substring(3));

        // // 6. name.substring(int start,int end) --> returns a substring from start index to the end index . sart index is inclided and end index is excuded.

        // System.out.println(name.substring(2,4 ));

        // //  7. name.replace(char 'r',char 'p') --> returns a new string after replacing r with p. Happy is returned in the case.

        // System.out.println(name.replace('a', 't'));
        // System.out.println(name.replace("ant", "nya"));

        // //  8. name.startswith()

        // System.out.println(name.startsWith("Us"));

        // // 9. name.endswith()

        // System.out.println(name.endsWith("nt"));

        // // 10. name.charAt()

        // System.out.println(name.charAt(3));

        // // 11. name.indexOf()
        
        // System.out.println(name.indexOf("n"));

        // String modifiedName="Usshannnttt";
        // // System.out.println(modifiedName.indexOf("nnnt"));
        // System.out.println(modifiedName.indexOf("nnnt",5));
        // System.out.println(modifiedName.indexOf("nya",5));
       
        // // 12. name.lastindexOf()

        // System.out.println(modifiedName.lastIndexOf("n"));
        // System.out.println(modifiedName.lastIndexOf("n",8));

        // // 13. name.equals()

        // System.out.println(name.equals("Ushant"));

        // // 14. name.equalsignorecase()

        // System.out.println(name.equalsIgnoreCase("USHANT"));

        // // ESCAPE SEQUENCE CHARACTERS 

        // // --> escape sequence characters consist of more than one characters but represents one character when used within the string.

        // // Ex:- \n, \t , \` ,\\ --> \ ,etc.

        // System.out.println("I am Escape sequence \\ double quote");
        // System.out.println("I am Escape sequence \n double quote");
        // System.out.println("I am Escape sequence \t double quote");
        // // System.out.println("I am Escape sequence \t double quote");

        // // 15.split();

        // System.out.println(split(" "));

        String str = " hello ";
        String str1 = " hello ";
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf('z'));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1, 3));
        System.out.println(str.trim());
        System.out.println(str.split(" "));
        System.out.println(str==str1);// do string compare nhi hote hai unka reference compare hoti hai 
        System.out.println(str.equals(str1));//string compare hote hai dushre string se yaha reference variable compare nhi hota hai
        String str2 = new String("hello");
        String str3 = new String("hello");
        System.out.println(str2 == str3);// yaha pe two new object bnta hai aur do object same nhi hota hai then it produce output as -->  false
        
        System.out.println(str2.equals(str3));// yaha pe string ka values compare hoti hai object nhi.
    }
}
