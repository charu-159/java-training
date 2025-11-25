//1question
package java2;

class Employee {
    int salary;
    String name;  // Corrected 'string' to 'String'

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class oopquestion {
    public static void main(String[] args) {
        Employee charu = new Employee();
        charu.setName("codewithcharu");
        charu.salary=333;
        System.out.println(charu.getSalary());
        System.out.println(charu.getName());
    }
}