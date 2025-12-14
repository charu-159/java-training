package java2;

import java.io.IOException;
import java.util.Scanner;

public class handlingspecificexception {
    public static void main(String[] args) {
        int [] marks =new int[3];
        marks[0]=20;
        marks[1]=10;
        marks[2]=30;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array index");
        int ind=sc.nextInt();
        System.out.println("enter the no. you want divide");
        int number=sc.nextInt();
        try {
            System.out.println("the value of array index" + marks[ind]);
            System.out.println("the value of array valur/num" + marks[ind] / number);
        }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        catch (ArithmeticException e) {
            System.out.println("arthmetic occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arrayindexout of bound occur");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("other exception occur");
            System.out.println(e);
        }
    }
}