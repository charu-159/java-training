package lec21;
import java.util.*;
public class stringAPI {
    public static void main(String[]args){
        //stiring api is used to
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
//        List<Integer> res=list.stream().filter(n->n>2).toList();
////        List<Integer> mapres=list.stream().map(n->n*2).toList();
//        int data=list.stream().reduce(0,(a,b)->a+b);
//        System.out.println(res);
////        System.out.println(mapres);
//        System.out.println(data);
        List<Integer> res=list.stream().filter(n->n>5).toList();
        List<Integer> re=res.stream().filter(n->n%2==1).toList();
//        List<Integer> mapres=list.stream().map(n->n%2).toList();
        int data=re.stream().reduce(0,(a,b)->a+b);
        List<Integer> result=list.stream().skip(2).toList();
        List<Integer> resut=list.stream().limit(8).toList();
        List<Integer> r=list.stream().sorted((a,b)->a-b).toList();
//        System.out.println(res);
        System.out.println(r);
        System.out.println(resut);
        System.out.println(result);
        System.out.println(re);
        System.out.println(data);
    }
}