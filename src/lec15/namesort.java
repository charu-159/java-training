//name wise sort
package lec15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



//if negative value the object is sorted else not
class student{
    String name;
    int RollNo;
    public student(String name, int RollNo){
        this.name = name;
        this.RollNo = RollNo;
    }
    public String toString(){
        return RollNo + " " +name;
    }
}
class NameSorted implements Comparator<student>{
    public int compare(student s1, student s2){
        return s1.name.compareTo(s2.name);
    }
}
class namesort {
    public static void main(String args[]) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student("Mansi", 2));
        list.add(new student("Chhavi", 1));
        Collections.sort(list,new NameSorted());
        System.out.println(list);
    }
}


