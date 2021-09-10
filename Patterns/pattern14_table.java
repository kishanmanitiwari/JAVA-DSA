
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

        for(int ja=1;ja<=10;ja++){
            System.out.println(n+" * "+ja+" ="+ n*ja);
        }
	}
}

