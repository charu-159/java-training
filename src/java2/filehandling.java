package java2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//to create a new file
public class filehandling {
    public static void main(String[] args) {
        /*File myfile =new File("newfile.txt");
        try {
            myfile.createNewFile();
        }catch(IOException e){
            System.out.println("unable to create file");
            e.printStackTrace();
        }*/


        //code to write to afile
        /*try {
            FileWriter filewrite = new FileWriter("newfile.txt");
            filewrite.write("this is the file file in java");
            filewrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        //reading a file
        /*File myfile=new File("newfile.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/


        //deleting a file
        File myfile=new File("newfile.txt");
        if(myfile.delete()){
            System.out.println("i have delete"+myfile.getName());
        }else{
            System.out.println("some problem error occured while deleting the file");
        }

    }
}