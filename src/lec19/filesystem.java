package lec19;
import java.io.File;
public class filesystem {
    public static void main(String[] args) {
    File file=new File("1st.txt");
    try {
        if (file.createNewFile()) {
            System.out.println("file created"+file.getName());
            System.out.println("file created"+file.getAbsolutePath());

        } else {
            System.out.println("this already");
        }
    }
        catch (Exception e){
        System.out.println("file created");
    }
    }
}

//write data
//package lec19;
//import java.io.File;
//import java.io.FileWriter;
//
//public class filesystem {
//    static void writeData(String data) {
//        try {
//            FileWriter writer = new FileWriter("new.txt");
//            writer.write(data);
//            writer.close();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void main(String[] args) {
//        writeData("new data");
//        //File file=new File("new.txt);
//    }
//}


//read
/*package lec19;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class filesystem {
    //write data
    /*static void writeData(String data) {
        try {
            FileWriter writer = new FileWriter("new.txt");
            writer.write(data);
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }*/

    //file read
/*static void FileRead(){
        try{
            FileReader reader=new FileReader("new.txt");
            int ch;
            while((ch=reader.read())!=-1){
            System.out.println((char)ch);
        }
        }
        catch(Exception e){
            System.out.println(e);
            }
    }*/
    //delete file
    /*static void FileDelete(){
        try {
            File file = new File("new.txt");
            if(file.delete()){
                System.out.println("file delete");
        }else{
                System.out.println("file not delete");
            }
    }catch(Exception e){
            System.out.println(e);

        }
    }
    public static void main(String[] args) {
        //writeData("new data");
        //FileRead();
        FileDelete();
        //File file=new File("new.txt);
    }
}*/
    //DATA DELETE





