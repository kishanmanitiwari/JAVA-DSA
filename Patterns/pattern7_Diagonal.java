
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

        int space = 0;
        int star = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }

                space++;
                 System.out.println();
              
            }

           
        }

	}


