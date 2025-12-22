package java2;

import java.util.ArrayList;

class mygeneric<t1> {
    int val = 364;
    private t1 T1;

    public mygeneric(int val, t1 T1) {
        this.val = val;
        this.T1 = T1;
    }

    public int getVal() {
        return val;
    }

    public t1 getT1() {   // Added getter
        return T1;
    }
}

public class generic {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(54);
        arraylist.add(444);

        int a = arraylist.get(1); // fixed index
        System.out.println("ArrayList element: " + a);

        mygeneric<String> g1 = new mygeneric<>(23, "mystring");
        String str = g1.getT1();
        System.out.println("Generic value: " + str);
    }
}

