import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    
    int n1=scn.nextInt();
    int a1[] = new int [n1];
    
    for(int i =0;i<a1.length;i++){
        a1[i]=scn.nextInt();
    }
    
    
     int n2=scn.nextInt();
    int a2[] = new int [n2];
    
    for(int i =0;i<a2.length;i++){
        a2[i]=scn.nextInt();
    }
    
    
    int [] sum = new int[n1>n2?n1:n2]; //Sum array is of largest num
    int c = 0;
    
    int i = a1.length-1; //Last Digit
    int j = a2.length-1;
    int k = sum.length-1;
    
    
   while(k>=0){ //jabtak ans array bacha hai
       int d = c;

       if(i>=0) d+=a1[i]; //jabtak n1 bacha hai
     
       if(j>=0) d+=a2[j]; //jabtak n2 bacha hai

       c = d/10; //Quotient gives carry
       d = d%10; //Rem gives digit

       sum[k] = d;

       i--;
       j--;
       k--;
   }
    
    if(c!=0)   System.out.print(c); //If carry is left then print that!
    
    
    for(int val:sum)  System.out.print(val); //for each loop prints value not the index
  
    
   
    
    
 }

}
