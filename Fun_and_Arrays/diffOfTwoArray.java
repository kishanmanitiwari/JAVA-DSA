 
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);

        //Array n1 ready
        int n1 = scn.nextInt();
         int arr1[] = new int [n1];
         for(int i=0;i<arr1.length;i++){
            arr1[i] = scn.nextInt();
        }

        //Array n2 ready
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
         for(int i=0;i<arr2.length;i++){
            arr2[i] = scn.nextInt();
        }


        //Array diff ready
        int diff[] = new int[n2];

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;
        int borrow = 0;

     

        while(k>=0){
            int digit = arr2[j]-borrow; //Adding in n2 bcz constrain is n2 is greater
          
            if(i>=0) digit-=arr1[i];
            
            if(digit<0){  //If subtraction is negative get me a borrow and add 10
                borrow=1;  
                digit+=10;
            }else  borrow=0;

            diff[k]=digit;

            i--; j--; k--;


        }
    //Get me idx till there is leading zero

         int idx = 0; 
       while(idx<diff.length){
           if(diff[idx]==0){
               idx++;
           }else{
               break;
           }
       }

    

    // Run from leading zero's idx to arr.length

       while(idx<diff.length){
           System.out.println(diff[idx]);
           idx++;
       }


	}
}

