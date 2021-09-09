
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
          int a=0;
        int b=1;
      

        for(int i=1;i<=n;i++){     //Simple FIbonacci Code + Print Increasing
            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");  //Its imp to do operation in col loop beacuse the value of each col pos mostly varies
            int c=a+b;
            a=b;
            b=c;
                     
            }
       

             System.out.println();
        }
       
        }


	}


