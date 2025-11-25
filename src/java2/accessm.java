//getter and setter
package java2;

class myemployee {
    //int id;
    //String name;

   private int id;
    private String name;//in this we don't get dierectly acess of id name
                        //it access with the help of method getter and setter

    public void setName(String name) {
        this.name = name;
    }
    public void setid(int a){
        id=a;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


public class accessm {
    public static void main(String[] args) {
        myemployee charu = new myemployee();
        //charu.id=45;
        //charu.name="rashi"//that throw the problem due to private acccess modifier
        charu.setName("codewithme");
        System.out.println(charu.getName());
        charu.setid(344);
        System.out.println(charu.getId());
    }
}
