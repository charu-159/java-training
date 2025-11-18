
//single,multilevel, level inheritance
class animal{
    void eat(){
        System.out.println("grass");
    }
}
class cow extends animal{
    void cow(){
        System.out.println("cow");
    }
}
//multilevel
class cub extends cow{
    void sleep(){
        System.out.println("eatttt");
    }
}

class inheritance{
    public static void main(String[] args){
        // cow a1=new cow();
        // a1.eat();
        cub s1=new cub();
        //multilevel
        s1.sleep();
        s1.cow();
        s1.eat();

    }
}