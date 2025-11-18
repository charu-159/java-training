package lecture6;
public class variable { //it is a class
    //int a=5;       //instant variable/non-static variable-declared outside method and inside class
    static int a=5;      //static variable
    public static void main(String args[]){
        //static use b/c here jym when call the function it will not ,make the object
        //int a=5;      //local variable - cannot be used outside method
        variable obj=new variable();       //object creation
        //System.out.println(obj.a);//for non static
        System.out.println(a);      //for static variable
    }
}



