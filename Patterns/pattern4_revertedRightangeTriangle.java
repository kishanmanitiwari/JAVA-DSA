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
        
        for(int i=1;i<=n;i++){   //this loop will contro the row


            for(int j=1;j<i;j++){
                System.out.print("\t");  //Print Increasing code (1->i) i stands for no.of rows
            }

             for(int j=i;j<=n;j++){
                System.out.print("*\t");  //Print Decreasing code (i->n) n stands for nth i/p
            }

              System.out.println();  //Always remeber we print row wise i.e left to right so after each intrn have println
        }


        }

	}


