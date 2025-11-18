//1 question
package lec9;

import org.w3c.dom.ls.LSOutput;

class person{
    String displayname(){
        return "archii";
    }
}
class student extends person {
    String displayclass(){
        return "3rd sem";
    }
}
class moniter extends student {
    String checkdisiplane(){
        return "undisciplane class";
    }
}

public class fourth {
    //    Q: Write a Java program where:- Class Person has method displayName()-
//    Class Student inherits Person and adds method displayClass()-
//    Class Monitor inherits Student and adds method checkDiscipline()-
//    Create an object of Monitor and call all three method
    public static void main(String[]args) {
        moniter m1 = new moniter();
        System.out.println(m1.displayname());
        System.out.println(m1.displayclass());
        System.out.println(m1.checkdisiplane());
    }
}