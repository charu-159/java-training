/*package java2;

public class methodoverloading {
    static void tell() {
        System.out.println("helllo");
    }

    public static void main(String[] args) {
      tell();
    }
}*/


package java2;

public class methodoverloading {
    //case 1-for an integer
    static void change(int x){
        x=98;
    }
    //case-2 for array

    static void change2(int[] arr){
        arr[0]=98;
    }


   public  static void main(String[] args) {
        int[] marks={23,43,67,87,88};
        //case 1=changing the integer
        /*int x=45;
        change(x);
       System.out.println("the value of x after running change is"+x);*/

       //case2 changing the array
       change2(marks);
       System.out.println("the value of x after running"+marks[0]);

    }
}


