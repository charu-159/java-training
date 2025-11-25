package java2;
class phone{
    public void greet(){
        System.out.println("good morning");
    }
    public void name(){
        System.out.println("turning on phone");
    }
}
class smartphone extends  phone{
    public void swagat(){
        System.out.println("namaste");
    }
    public void name(){
        System.out.println("turning on smartphone");
    }
}
public class dyanamic_dispatch {
    public static void main(String[] args) {
        //phone obj=new phone();
        //obj.name();
        //smartphone  obj2=new smartphone();
        //obj2.name();
        phone obj=new smartphone();//if reference superclass or object subclass ka hai to yeh kar skate hai
        //smartphone obj=new phone();//it give error
        obj.greet();
        obj.name();//smartphone name run-refernce nai obj ka run hoga
                     //this is dynamic method dispathch
       // obj.swagat();//it not run b/c it is not overriden or bo method jab call karenga jo superclass mai nai hai to bo not allow
    }//this is dynamic method dispathch
}