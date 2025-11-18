package lecture5;
public class reverse {
    public static void main(String[] args) {
       /* String str="I love java";
        String a[]=str.split(" ");
        StringBuilder result=new StringBuilder();
        for( String val:a){
            StringBuilder data =new StringBuilder(val);
            result.append(data.reverse()).append(" ");

        }
        System.out.println(result);


    }
    }*/
        //compress
        String str="aaabccdd";
        StringBuilder result=new StringBuilder();
        int count=1;   //means there is atleast 1 element
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                result.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        result.append(str.charAt(str.length()-1)).append(count);
        System.out.println(result);
    }
}
