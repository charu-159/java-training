//type of method
package lecture6;

public class method{
    void Sum(){
        System.out.println("hello");
    }
    public static void main(String args[]){
        method obj=new method();
        obj.Sum();//object creation
        //System.out.println(obj.a);   //for non-static/instant variable & static both
        //System.out.println(a);        //for static variable only
    }
}