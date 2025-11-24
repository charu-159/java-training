package java2;
public class loop {
    public static void main(String[] args) {
        /*for(int i=0;i<=10;i++){
            System.out.println(i);
        }*/

        //odd no.
        /*int n=5;
        for(int i=0;i<5;i++){
            System.out.println(2*i+1);
        }*/
        //even no.
        /*int n=5;
        for(int i=0;i<5;i++){
            System.out.println(2*i);
        }*/
        //decrment of loop
        /*for(int i=5;i>0;i++){
            System.out.println(i);
        }*/
        //break and continue statemment using loop
        /*for(int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("java is great");
            if(i==2){
                System.out.println("ending loop");
                break;
            }
        }
        System.out.println("loop end here");*/

       /* int i = 0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("java");
            if (i == 2) {
                System.out.println("ending");
                break;
            }
            i++;
        }
            System.out.println("loop");*/


        for (int i = 0; i < 5; i++) {


            if (i == 2) {
                System.out.println("ending loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
    }
}


