
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
        int count  = 1; //This will get printed and incremented after each col operations

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+"\t");
                     count++;
            }
       

             System.out.println();
        }

	}
}

