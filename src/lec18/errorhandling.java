package lec18;

public class errorhandling {
    public static void  main(String[]args){
        try{
            riskyMethod();
        }
        catch(Exception e){
            System.out.println("main handels this");
        }
        System.out.println("Program Continue...");
    }
    static void riskyMethod() throws ArithmeticException{
        System.out.println("riskyMethod start");
        int result=10/0;
        System.out.println("Result:"+result);
        System.out.println("riskyMethod end");
    }
}