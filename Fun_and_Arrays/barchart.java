import java.util.Scanner;

public class barchart {
    public static void main(String[] args) {
      
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //Approach->
        //Find the maxi first that is the highest height or the col in the row to be printed
        //Run a loop from maxi -1 and itreate over the arrays
        //Compare the row loop(height) with col loop(bld) if its >=height print* or print""
        //Note its print while printing col and println to got to next row

        int arr[] = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }

        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxi) maxi=arr[i];
        }

       for (int height = maxi; height>0; height--) {
           for (int bld = 0; bld < arr.length; bld++) {
               if(arr[bld]>=height){
                   System.out.print("*\t");
               }else{
                   System.out.print("\t");
               }
                              
           }
           System.out.println();
           
       }


    }
}
