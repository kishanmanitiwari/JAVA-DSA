import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scn = new Scanner(System.in);
   	 int low = scn.nextInt();//3
   	 int high = scn.nextInt();//7


       for(int i = low;i<=high;i++){ //3-7
   
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

           if(flag)System.out.println(i);

       }



    







	}
}
