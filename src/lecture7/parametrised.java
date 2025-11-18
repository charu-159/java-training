package lecture7;
class Car {
    int a;
    String name;
    Car(int a,String name){
        this.a=a;
        this.name=name;
        System.out.println("name:"+"" +name);
        System.out.println("a:"+"" +a);
    }
}
class parametrised {
    public static void main(String args[]) {
        Car c = new Car(5, "charu");
        Car c1 = new Car(2, "yxa");

    }
}
