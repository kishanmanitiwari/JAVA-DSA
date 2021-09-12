
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

        int st=1;
        int space = (2*n)-3;
       

       for(int i=1;i<=n;i++){
            int val=1;
           for(int j=1;j<=st;j++){
               System.out.print(val+ "\t");
                val++;
           }
          
           
           for(int j=1;j<=space;j++){
               System.out.print("\t");
           }
           if(i==n){
               st--;
               val--;
             
           }

           for(int j=1;j<=st;j++){
               val--;
               System.out.print(val+ "\t");
          

           
               
           }

           st++;
           space -=2;
           

            System.out.println();

       }
	}

}


