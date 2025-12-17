//rearrange array in alternating positive and negative item
package code50;
public class eleven {
    public static void main(String[] args) {
        int [] arr={1,2,-3,-4,6,-8,5};
        int n=arr.length;
          int j=0;
          for(int i=0;i<n;i++){
              if(arr[i]<0){
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  j++;
              }
          }
          int neg=0;
          int pos=j;
          while(neg<pos && pos<n && arr[neg]<0){
              int temp=arr[neg];
              arr[neg]=arr[pos];
              arr[pos]=temp;
              neg +=2;
              pos++;
          }
          for(int x:arr){
              System.out.print(x+"");
          }
    }
}