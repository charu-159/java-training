package lec12;
 class atm{
    private int totalbalance=10000;
     public void getbalanced(){//getter
         System.out.println(totalbalance);
     }
     public void setbalance(int amount){//setter
         if(amount>0){
             totalbalance+=amount;
         }
     }
 }

 class hello{
     public static void main(String[] args){
         atm s1=new atm();
         s1.getbalanced();
         s1.setbalance(400);
     }
 }