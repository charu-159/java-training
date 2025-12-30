//reverse a string
package code50;
public class twentyone21 {
    public static void main(String[] args) {
        String name ="charu";
        String rev ="";
        for(int i=name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        System.out.println("reversed loop:-"+rev);

    }
}