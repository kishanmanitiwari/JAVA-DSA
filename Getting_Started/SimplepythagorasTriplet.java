import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{

        Scanner fs = new Scanner(System.in);
		int n1=fs.nextInt();
        int n2=fs.nextInt();
        int n3=fs.nextInt();

        //Part 1 -> Fimd max that acts as hypo

   if(n1*n1+n2*n2 == n3*n3 || n1*n1+n3*n3 == n2*n2 || n3*n3+n2*n2 == n1*n1)System.out.print(true);
   else System.out.print(false);




	}
}

