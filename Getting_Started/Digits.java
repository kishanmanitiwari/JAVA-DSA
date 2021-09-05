  
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

        //Part A Finding Divisor

        int div =1;
        int temp = n; //Its imp to use temp else actual value will be destroyed and we shall not
                            //be abe to use in part B

        while(temp>=10){  //i.e till you have single digits left or 10
            temp = temp/10; //Keep shortening the vaue by getting qt
             div*=10;       //eg 234 -> 23(4)->10 // 2(3)->10*10=100 // (2)=False 
        }



    
    //Part B Digit Count


    while(div>=1){ //Note Div is global var!

       int qt=n/div; // 2
       int rem = n%div; //34

       System.out.println(qt); //2->3->4
        div/=10; //keep reducing the divisor 100/10 =10  10/10 =1  1/10->(false)
        n=rem;  //Update the new n 
        

    }



	}
}

