package lecture5;
public class string{
    public static void main(String[] args){
     StringBuilder str=new StringBuilder("hello");
     //1.append
     str .append("byee");
        System.out.println("Append:"+str);
        //2.insert
     str.insert(1,"byee"+str);
        System.out.println(str);
        //.replace()
        str.replace(1,4,"java");
        System.out.println("replace():"+str);
        //4.delete
        str.delete(2,6);
        System.out.println("delete():"+str);
        // 5.delete char at
         str.deleteCharAt(1);
        System.out.println("deleteCharAt():"+str);
        // 7.reverse()
        str.reverse();
        System.out.println("reverse():"+str);
        //8.length()
        System.out.println("length()"+str.length());
        //9.capacity()
        System.out.println("capacity():"+str.capacity());
    }
}
