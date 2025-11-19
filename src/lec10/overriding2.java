//overriding of upper casting and lower casting
package lec10;
class Animal{
    void eat(){
        System.out.println("pizza");
    }
    void data(){
        System.out.println("hello");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("roti");
    }
    void sleep(){
        System.out.println("hiii");
    }
}
class overrriding2{
    public static void main(String[] args) {
        Animal s1=new Dog ();//uppercasting
        s1.eat();//which eat will run
        Dog d1 = (Dog) s1;       // lowercasting or downcasting
        d1.sleep();              // prints "hiii"


    }
}