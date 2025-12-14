package java2;
public class trycatch{
    public static void main(String[] args) {
    int a=6000;
    int b=0;//it give arthmetic exception then we use try in that case it alseat try to run
        //without try
//        int c=a/b;
//        System.out.println(c);
        //with try
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("end of program");


}
}