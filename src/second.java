/*import java.util.Scanner;
public class second{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter int: ");
        int a=sc.nextInt();

        System.out.print("Enter Double: ");
        double b=sc.nextDouble();

        System.out.print("Enter String: ");
        String c=sc.next();
        sc.nextLine();

        System.out.print("Enter Line: ");
        String d=sc.nextLine();

        System.out.println("Integer: "+a);
        System.out.println("Double: "+b);
        System.out.println("String: "+c);
        System.out.println("Line: "+d);
    }
}*/
//type casting
/*class second{
    public static void main (String [] args){
        short a=131;
        byte b=(byte)a;
        System.out.println(b);
    }
}*/
//string

/*class second{
 public static void main(String[] args){
 String str="charu";
       //create string
       for(int i=0;i<str.length();i++) {
            System.out.println(str.charAt(i));
        }
        //reverse string
        for(int i=str.length()-1;i>=0;i--) {
            System.out.println(str.charAt(i));


        }
    }
*/
public class second{
    public static void main(String[] args){
        //byte a=5;
        //short b=a;             //automatic typecasting
        //int c=b;
        short a=13;
        byte b=(byte)a;
        System.out.println(b);  //in forceful typecasting there are chances of data lost

        //to create a string
        String str="hello";
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }


        //to reverse a string
        String str1="hello";
        for(int i=str1.length()-1;i>=0;i--){
            System.out.println(str1.charAt(i));
        }

        //Palindrome string
        String str2=new String("hello");
        char[] ch= str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }
}

