package java2;

import javax.script.ScriptContext;
import java.util.Scanner;

public class nestedtrycatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int ind = sc.nextInt();
        System.out.println("enter the value of index");
        while (flag) {
            try {
                System.out.println("welcome");
                try {
                    System.out.println(marks[ind]);//if this try wrong then iss ka hi catch will be run
                    //if it true then outside catch run
                    flag=false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry");
                    System.out.println("exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("exception in level one");
                // System.out.println(e);
            }
        }
        System.out.println("thanks");
    }
}