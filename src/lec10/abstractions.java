//abstractions
package lec10;

abstract class Animal1{
    abstract void eat();
}
class Cat extends Animal1{
    void eat(){
        System.out.println("hellooo");
    }
}
class abstractions{
    public static void main(String[] args){
      Cat d1=new Cat();
      d1.eat();
    }
}
