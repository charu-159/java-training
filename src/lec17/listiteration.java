package lec17;

import java.util.ArrayList;
import java.util.ListIterator;

public class listiteration {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        ListIterator<Integer> it = list.listIterator();
        //forward data print
        /*while (it.hasNext()) {
            Integer x = it.next();
            System.out.println(x);
        }
        //backward data print
        while (it.hasPrevious()) {
            Integer y = it.previous();
            System.out.println(y);
        }

    }
}*/
 //ADD A NO.
/*while(it.hasNext()){
    Integer x=it.next();
    if(x==7){
        it.set(10);
    }
}
        System.out.println(list);
}
    }*/
        //odd no.replace by -1
        while (it.hasNext()) {
            Integer x = it.next();
            if (x % 2 == 1) {
                it.set(-1);

            }
        }
        System.out.println(list);
    }
}

