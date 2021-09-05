
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
        int n = scn.nextInt();//234

        int counter = 0;

        while(n!=0){
            int rem = n%10; // 4(On  Divide on 10 i.e (unit decimal) takes out last digit)
            n=n/10;  //23(Acts as Quotient)
            counter++; //1
            }

        System.out.println(counter);

	}
}

