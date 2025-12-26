//lect7
//constructor(different types)
class CAR2{
    public CAR2(){
        System.out.println("hello");
    }
    public CAR2(int x){
        System.out.println(x);
    }
    public CAR2(int x,int y){
        System.out.println(x+y);
    }
}

class constdifftype{
    public static void main(String[] args){

       CAR2 c1=new CAR2();
       CAR2 C2=new CAR2(7);
        CAR2 c3=new CAR2(7,8);
    }
}