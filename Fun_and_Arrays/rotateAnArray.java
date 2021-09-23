 import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  //Aproach ->
  //A -> A` //first part reverse
  //B -> B` //Second part  reverse 
  //(AB)` -> AB //All reverse 

  public static void rotate(int[] a, int k){

        k=k%a.length; //Handles Large i/p
      if(k<0){
          k=k+a.length;  //Handles -ve Num
      }

         reverse(a,0,a.length-k-1); // k->2 n=5 5-2=3 0-3

         reverse(a,a.length-k,a.length-1);

         reverse(a,0,a.length-1);
  }
  
   public static void reverse(int[] a,int start,int end){
    int low = start;
    int hi = end;
    
    while(low<hi){
        int temp = a[low];
         a[low] = a[hi];
         a[hi] = temp;
         low++;
         hi--;
        
    }
    
    
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
 
    display(a);
    

 }

}