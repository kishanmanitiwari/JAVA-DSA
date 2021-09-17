import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    
    System.out.println(getSpan(arr,n));
 }

 public static int getSpan(int arr[],int size){
     int max = arr[0]; //considering min as arr[o]
     int min = arr[0]; //considering max as arr[o]

     for(int i=1;i<arr.length;i++){ //going from 1-arrlength because min/max is cosnidered as arr[0]

         if(arr[i]>max)  max=arr[i]; //manipualate max if found!
            
         if(arr[i]<min) min = arr[i]; //manipulate min if found!
             
  }

    
     return max-min; //return the diffrence
     


 }

}