import java.util.Arrays;
//
public class fourth {
    public static void main(String[] args) {
        //duplicate remove

        /*String str = "hello";
        String newstr="";
        for(char ch: str.toCharArray()){
            if(newstr.indexOf(ch)==-1){
                newstr+=ch;
            }

        }
        System.out.println(newstr);



    }
}*/
        //frequency
        /*int freq[] = new int[256];
        String str = "charuu";
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + "=" + freq[i]);
            }
        }
    }
}*/
        //from sentence larger word print
        /*String str = "java is powerfull";
        String a[] = str.split(" ");
        String largest = " ";
        for (String s : a) {
            if (s.length() > largest.length()) {
                largest = s;
            }
        }
        System.out.println(largest);
    }
}*/
//count no.of word in sentence
        /*String str = "java is powerfull";
        String []ch = str.split(" ");

        int count=0;
        for (String s : ch) {
            count++;
        }
        System.out.println(count);
    }
}*/
        //anagrams
        //5.Anagram String
        String str1="hello";
        String str2="lloeh";
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str3=new String(ch1);
        String str4=new String(ch2);
        if(str3.equals(str4)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}









