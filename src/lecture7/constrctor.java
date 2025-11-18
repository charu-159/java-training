//constructor
package lecture7;
/*class car {
    //car()//default constructor
    car(String a){//parametrised constructor
       // System.out.println(a);
        System.out.println("hello");
    }
}
class constrctor{
    public static void main(String args[]) {
        //car c=new car();
        car c=new car("byee");
        //car b=new car("hiii");
    }
}*/
//lect7
//constructor(different types)
/*class car{
    public car(){
        System.out.println("hello");
    }
    public car(int x){
        System.out.println(x);
    }
    public car(int x,int y){
        System.out.println(x+y);
    }
}

class constructor {
    public static void main(String[] args){
        car c1=new car();
        car c2=new car(7);
        car c3=new car(7,8);
    }
}*/
//constuctor chaining(using this keyword)
//ek object bnake teeno functions ko call kiya ja skte hai
class car{
    public car(){
        this(7);    //this will call the next function which has one parameter passed
        System.out.println("hello");
    }
    public car(int x){
        this(7,8);
        System.out.println(x);
    }
    public car(int x,int y){
        System.out.println("x:"+x  +" y:"+y);
    }
}

class constructor {
    public static void main(String[] args){
        car c1=new car();
        // car c2=new car(7);
        //car c3=new car(7,8);
    }
}



