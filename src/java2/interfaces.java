package java2;

interface bicycle{
    void applybrake(int decrement);
    void speedup(int increment);
    int a=45;//final

}
interface hornbicycle{
    void blowhornk3g();
    void blowhornmhn();

}
class Avoncycle implements bicycle,hornbicycle{
    void blowhorn(){
        System.out.println("pee poo");
    }
    public void applybrake(int decrement){
        System.out.println("apply brake");
    }
    public void speedup(int increment) {
        System.out.println("apply speed");
    }
    public void blowhornk3g(){
        System.out.println("hiii");
    }
    public void blowhornmhn(){
        System.out.println("hello");
    }
}
 public class interfaces{
    public static void main(String[] args) {
   Avoncycle c1=new Avoncycle();
   c1.applybrake(1);
   c1.speedup(3);
   c1.blowhorn();
   //you can create  properties in interfaces
        System.out.println(c1.a);
        //you cannot modify the properties in interface as they are final
        //c1.a=445;
        c1.blowhornk3g();
        c1.blowhornmhn();



    }
        }