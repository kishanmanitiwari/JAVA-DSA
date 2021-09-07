 import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    
    for(int i=1;i<=(int)Math.sqrt(n);i++) //Loop goes till nth root
    System.out.println(i * i); //Print Suare of the ith root 
        

   }
  }

 //Approach-> Initially all the bulbs  are off so when the flctauation occurs only those bulb will remain on having odd flctauations. 
// And all perfect sqaures  have odd fluctations becasuse there factor comes out to be 2n+1 factors... 


//Eg - 36-> have 9 factors so odd and why odd matters because on every even fluctuation the bulb will come to its orignal state..
// Eg-4(Perfect Square) -> 1->ON 2-> OFF  4-> ON and 4 has 2n+1 factors that is odd.
