package java2;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return super.toString()+"i am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"i am get message";
    }
}
public class exceptionclass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
      if(a<9){
          try {
              //throw new MyException();
              throw new ArithmeticException("this is an exception ");
          }catch(Exception e){
              System.out.println(e.getMessage());
              System.out.println(e.toString());
              e.printStackTrace();
              System.out.println("finished");
          }
          System.out.println("yes finish");
      }
    }
}