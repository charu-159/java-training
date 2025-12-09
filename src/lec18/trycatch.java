package lec18;

public class trycatch {

    public static void main(String[]args){
        try{
            voteAge(15);
        } catch (Exception e) {
            System.out.println(e);
        }
        try{
            voteAge(19);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    static void voteAge(int age){
        if(age<18){
            throw new IllegalArgumentException("you are not able to vote");
        }
        else{
            System.out.println("able to vote");
        }
    }

}