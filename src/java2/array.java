package java2;
public class array {
    public static void main(String[] args) {
        //classroom of 500 student-store mark
       // 2 option -1.use new variable 2.use array
      //1.int [] marks=new int[5];
        int [] marks;
        marks=new int[5];
        //int [] marks={100,333,22,44,44}

      marks[0]=100;
      marks[1]=43;
      marks[2]=54;
      marks[3]=555;
      marks[0]=99;
        System.out.println(marks[3]);
    }
}