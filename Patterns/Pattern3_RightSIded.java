import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{

        Scanner fs = new Scanner(System.in);
		int n=fs.nextInt();
        
        for(int i=1;i<=n;i++){


              for(int j=i;j<n;j++){
                System.out.print(" \t");
            }
        
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            
          



              System.out.println();
        }


        }

	}


