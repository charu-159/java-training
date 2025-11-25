package java2;
public class arraypractise {
    public static void main() {
        //create float array
      /* float[] marks = {45.7f, 46.3f, 66.0f, 65.2f, 100.2f};
     float sum=0;
     for(float element:marks){
         sum=sum+element;
     }
       System.out.println("the value of sum"+sum);
   }
}*/
//2nd-find num is present in any array or not
        /*float[] marks = {45.7f, 46.3f, 66.0f, 65.2f, 100.2f};
        float num = 45.7f;
        boolean isInArray = false;//initially assume that value is not in array
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("the value is present");
        } else {
            System.out.println("not present");
        }
    }
}*/


//3rd-average mark contain all student in physics using for loop
       /* float[] marks = {45.7f, 46.3f, 66.0f, 65.2f, 100.2f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("the value of average mark" + sum / marks.length);
    }
}*/

//4th=add two matrix of size 2*3
        /*int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{4,5,7,},
                {3,8,7}};
        int[][] result = {{0,0,0,},
                {0,0,0}};


                //printing the array of 2d array
        for(int i=0;i<mat1.length;i++){//row no.of times
            for(int j=0;j<mat1[j].length;j++){
                System.out.format("setting value for i=%d and j=%d",i,j);

                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
    }
}*/
//reverse a array
       /* int[] arr = {1, 3, 2, 4, 5, 6};
        int l = arr.length;
        int temp;
        int a = Math.floorDiv(arr.length, 2);
        System.out.println(a);
        for (int i = 0; i < a; i++) {
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
        //swap a[i]and a[l-1-i]
        for (int element : arr) {
            System.out.println(element);
        }
    }
}*/


//6th max element
        /*int[] arr = {1, 3, 2, 4, 5,- 6};
        //int max=0;
        int max=Integer.MIN_VALUE;
        for(int element:arr){
            if(element>max){
                max=element;
            }
        }
        System.out.println("the amx value"+max);
        }
    }*/

    //7TH SORTED ARRAY
        boolean isSorted=true;
    int[] arr = {1, 87, 2, 78, 5, 6};
for(int i=0;i<arr.length;i++) {
    if (arr[i] > arr[i + 1]) {
        isSorted = false;
        break;
    }
}
if(isSorted){
    System.out.println("sorted");
}else{
    System.out.println("not sorted");
}

}



}