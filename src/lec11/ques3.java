//Q3. Create an interface Animal with a method makeSound().
//Then, create a class Dog that implements Animal and overrides makeSound() to print "Bark".
//In the main method, use the interface reference to call the method from Dog.
interface animals{
    void makesound();
}
class dog implements animals{
    public void makesound(){
        System.out.println("Bark");
    }
}
public class ques3 {
    public static void main(String[] args) {
        animals a=new dog();
        a.makesound();
    }
}
