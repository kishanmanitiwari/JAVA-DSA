 
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

       

        for(int i=n;i>=1;i--){ //5 //5->1 Note- i-- is imp

            for(int j=1;j<=i;j++){ //Moves itnr from 1-5,1-4,1-3,1-,2,1-1 on each itrn
             
                     System.out.print("*\t");
            }

             System.out.println(); //After each space put a line break!


        } 

	}
}

