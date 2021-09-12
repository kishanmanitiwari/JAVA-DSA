
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star =n;
        int space = 0;

       for(int i=1;i<=n;i++){
           for(int j=1;j<=space;j++){ 
                 System.out.print("\t");
           }
            for(int j=1;j<=star;j++){ 
                if(i>1 & i<=n/2 && j>1 && j<star)  System.out.print("\t"); //If >>1 row and less that mid row & >1col and less than last col print space
                    
                else  System.out.print("*\t");  //else print * everwhwere
                
           }  
               

              System.out.println();

              if(i<=n/2){
                  star -=2;
                  space++;
              }else{
                  star +=2;
                  space--;
              }

               
           }

     }
	}





