//use of this v/s super keyword
//super keyword-parent k variable ko access krta hai
//this - current variable ko access karega
package lec9;
class parent{
    int x=10;
    parent(){
        System.out.println("parent constructor:"+x);
    }
}
class child extends parent{
    int x=20;
    child(){
        System.out.println("child this.x:"+this.x);
        System.out.println("super super.x:"+super.x);
    }
    void show(){
        int x=30; //local variable
        System.out.println("local x:"+x);
        System.out.println("this.x:"+this.x);
        System.out.println("super.x:"+super.x);
    }
}
class superkeyword{
    public static void main(String[] args){
        child c=new child();
        c.show();
    }
}