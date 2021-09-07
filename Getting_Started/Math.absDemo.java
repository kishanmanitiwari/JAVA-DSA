
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner fs = new Scanner(System.in);

        int num = Math.abs(fs.nextInt());  //If num is +ve return if -ve return its negation
						//Abs stand for Absolute

        System.out.println(num);
	}
}

