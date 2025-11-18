package lec9;
class overloading2{
    void add(int a){
        System.out.println(a);
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        overloading2 obj=new overloading2();
        obj.add(5);
        obj.add(5,5,5);
        obj.add(5,5);
    }
}