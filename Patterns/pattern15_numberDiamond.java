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

        int space = n/2;
        int star = 1;
        int val =1;//This will set the starting point

        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            
            int limit=val;//This will set the limit of the loop
            for(int j=1;j<=star;j++){
                System.out.print(limit+"\t");

                if(j<=star/2){
                     limit++; //Increase limit on haf way till jth col
                }else{
                     limit--; //Decrease limit after half way after jth col 
                }
               
            }

            if(i<=n/2){
                space--;
                star+=2;
                val++; //Increase start val halfway

            }else{
                space++;
                star-=2;
                val--; //Decrease start at half way
            }

            System.out.println();
        }

	}
}

