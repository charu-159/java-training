package java2;
import java.util.Scanner;
public class string2 {
    public static void main(String[] args) {
        String name = "Harry";
        int value=name.length();
        System.out.println(value);

        String lstring=name.toLowerCase();
        System.out.println(lstring);

        String ustring=name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString="  harry";
        System.out.println(nonTrimmedString);

        String TrimmedString=nonTrimmedString.trim();
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rry","ier"));


        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("har"));

        System.out.println(name.charAt(2));

        System.out.println(name. indexOf("r"));


        String modifiedName="harryrry";
        System.out.println(modifiedName. indexOf("r1233"));
        System.out.println(modifiedName. indexOf("rry",4));

        System.out.println(modifiedName. lastIndexOf("r"));
        System.out.println(modifiedName. lastIndexOf("r",4));

        System.out.println(name. equals("Harry"));

        System.out.println(name. equalsIgnoreCase("harry"));

        //escape sequence character
        System.out.println("i am charu \" double quotes");
        System.out.println("i am charu\tdouble quotes");
    }
}
