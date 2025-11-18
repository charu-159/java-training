//lect7
//constructor(different types)
class car2{
    public car2(){
        System.out.println("hello");
    }
    public car2(int x){
        System.out.println(x);
    }
    public car2(int x,int y){
        System.out.println(x+y);
    }
}

class constdifftype{
    public static void main(String[] args){
        car2 c1=new car2();
        car2 c2=new car2(7);
        car2 c3=new car2(7,8);
    }
}