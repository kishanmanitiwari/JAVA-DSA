
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

    int max = 0;

    if(n1>n2)max=n1;
    else if(n2>n3)max=n2;
    else max=n3;

    // PPart 2-> Determine Hypo and evaluate condtion using a flag

    boolean flag = false;

    if(max==n1) flag=((n2*n2 + n3*n3)==(max*max));

    else if(max==n2) flag=((n1*n1 + n3*n3)==(max*max));

    else  flag=((n1*n1 + n2*n2)==(max*max));
       
    


    System.out.println(flag);



	}
}

