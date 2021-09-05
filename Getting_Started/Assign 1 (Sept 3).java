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

    int i = 1;
    while(i<=n){ System.out.println(i%2==0 ? i+" -> Even" : i+" -> Odd");i++;}    
	}
}
