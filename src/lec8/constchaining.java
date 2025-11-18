//constuctor chaining(using this keyword)
//ek object bnake teeno functions ko call kiya ja skte hai
class bus{
    public bus(){
        this(7);    //this will call the next function which has one parameter passed
        System.out.println("hello");
    }
    public bus(int x){
        this(7,8);
        System.out.println(x);
    }
    public bus(int x,int y){
        System.out.println("x:"+x  +" y:"+y);
    }
}

class constchaining{
    public static void main(String[] args){
        bus c1=new bus();
        // car c2=new car(7);
        //car c3=new car(7,8);
    }
}