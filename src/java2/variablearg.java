package java2;
public class variablearg {
    /*static int sum(int a,int b) {
        return a + b;
    }
    static int sum(int a,int b,int c) {
        return a + b+c;
    }*/
    //itna sare method bane ki jarurat nai hai in place of this we write the simple method
    //this--
    /*static int sum(int...arr) {
        // above=it available as int []arr;
        int result = 0;
        for (int a : arr) {
            result = +a;
        }
        return result;
    }
   public static void main(String[] args) {
       System.out.println("welcome to vararg ");
       System.out.println("the sum is nothing"+sum());
       System.out.println("the sum of 1 is"+sum(1));
       System.out.println("the sum of 4 qnd 5 is"+sum(4,5));
       System.out.println("the sum of 4 ,3qnd 5 is"+sum(4,3,5));
    }
}*/
    //in this fix one parameter
static int sum(int x,int...arr) {
    // above=it available as int []arr;
    int result = x;
    for (int a : arr) {
        result = +a;
    }
    return result;
}
public static void main(String[] args) {
    System.out.println("welcome to vararg ");
    //System.out.println("the sum is nothing"+sum());  //so this give erroe b/c no parameter is pass
    System.out.println("the sum of 1 is"+sum(1));
    System.out.println("the sum of 4 qnd 5 is"+sum(4,5));
    System.out.println("the sum of 4 ,3qnd 5 is"+sum(4,3,5));
}
}