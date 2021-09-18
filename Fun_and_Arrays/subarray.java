 
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

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        

        for(int startIdx=0; startIdx<arr.length; startIdx++){ // Controls the starting point

            for(int endIdx = startIdx; endIdx<arr.length; endIdx++){ //Mnipulate the end i.e-> grp 
			//eg - IF si = 0
			//0 -> 0-0
			//1 -> 0-1
			//2 -> 0-3 and so on...
			

                for(int content=startIdx; content<=endIdx; content++){//Imp to go till <=
                    
                    System.out.print(arr[content] + "\t");
                }
                    System.out.println();


            }
        }







	}
}

