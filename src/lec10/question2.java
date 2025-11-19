//Create an abstract class 'Animal' with method 'sound()'. Create classes 'Dog' and 'Cat' that extend
//it and implement the sound method
package lec10;
abstract class animal{
    abstract void sound();
}
class DOG extends animal{
    void sound(){
        System.out.println("dog:woof woof ");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("cat:meow meow");
    }
}
class question2{
    public static void main(String[] args) {
        animal d1 = new DOG();  // Polymorphism
        animal c1 = new cat();

        d1.sound();  // Calls Dog's implementation
        c1.sound();  // Calls Cat's implementation
    }
}

