//remove duplicate from a string
package code50;
public class twentythree23 {
    public static void main(String[] args) {
        String str="raashi";
        String result="";
        for(int i=0;i<str.length();i++){
            boolean duplicate=false;
            for (int j=0;j<result.length();j++){
                if(str.charAt(i)==result.charAt(j)){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                result +=str.charAt(i);
            }
        }
        System.out.println("origial:"+str);
        System.out.println("remove duplicate:"+result);
    }
}