//youtube channel subscriber count
package lec12;
class yt{
    private String channelname;
    private int subscribercount;
    public  yt(String channelname,int subscribercount) {
        this.channelname = channelname;
        this.subscribercount=0;
    }
    public void getname(){
        System.out.println(channelname);
    }
    public void getsubscribercount(){
        System.out.println(subscribercount);
    }
    public void setSubscribercount(){
        subscribercount ++;
        System.out.println(subscribercount);

    }


    public void setunsubscribercount() {
        if (subscribercount > 0) {
            subscribercount--;
            System.out.println(subscribercount);
        } else {
            System.out.println("subscriber out of range");
        }
    }
        public void password(int pin) {
            if (pin==12345) {
                System.out.println("passwaod is correct");
            } else {
                System.out.println("password is incorrect");
            }
        }

            }

public class youtube{
  public static void main(String[] args)  {
     yt s1=new yt("charu",0);
     s1.getname();
     s1.getsubscribercount();
     s1.setSubscribercount();
     s1.setSubscribercount();
     s1.setunsubscribercount();
     s1.password(12345);

  }
}