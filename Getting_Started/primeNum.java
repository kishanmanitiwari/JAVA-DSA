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
        int i = scn.nextInt();


        int div =2;
        boolean flag = true;

        while(div*div<=i){
            int rem = i%div;

            if(rem==0){
                flag=false;
                break;
            }
            div++;
        }

           System.out.println(flag?"It is a Prime!":"It is not a prime number!");
	}
}

