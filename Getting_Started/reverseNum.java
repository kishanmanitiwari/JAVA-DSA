
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();

        while(n>0){  //Note n is global variable so always evalate that
            
            int rem = n%10; //4
            System.out.println(rem);//4
            n=n/10; //324 -> 32


        }


	}
}

