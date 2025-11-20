//use of this v/s super keyword
//super keyword-parent k variable ko access krta hai
//this - current variable ko access karega

class Parent {
    int x = 10;   // parent variable

    Parent() {
        System.out.println("Parent constructor: " + x);
    }
}

class Child extends Parent {
    int x = 20;   // child variable

    Child() {
        System.out.println("Child this.x: " + this.x);   // child variable
        System.out.println("Child super.x: " + super.x); // parent variable
    }

    void show() {
        int x = 30; // local variable
        System.out.println("Local x: " + x);
        System.out.println("this.x: " + this.x);   // child variable
        System.out.println("super.x: " + super.x); // parent variable
    }
}

class Keyboard {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}