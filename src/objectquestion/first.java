//Create a class Student with fields name, rollNumber, and marks. Write a method to display
//student details. Create 3 student objects and display their data
package objectquestion;
class student {
    String field;
    int rollno;
    float marks;
    void disp(){
        System.out.println("field:"+field);
        System.out.println("rollno:"+rollno);
        System.out.println("marks:"+marks);

    }
}
public class first{
    public static void main(String args[]) {
        student s1=new student();
        s1.field="btech";
        s1.rollno=18;
        s1.marks=70;
        student s2=new student();
        s2.field="mba";
        s2.rollno=19;
        s2.marks=90;
        student s3=new student();
        s3.field="btech";
        s3.rollno=123;
        s3.marks=80;
        s1.disp();
        s2.disp();
        s3.disp();
    }
    }
