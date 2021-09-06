
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
        int n = scn.nextInt();
        int value = 0;
        int place = 1;


        while(n>0){

            int rem = n%10;//1 -> 5
             n = n/10;//2834675 -> 283467

             //Value-> 28346751    Value -> 73425681   //Eg Pos 2 pe Value 5 hai so -> Pos 5 pe Vale 2 hai
             //Pos  -> 87654321   //Pos->   87654321  

             //Pos->Vaulue & Value->Pos

             //= pos*pow(10,rem-1);
             //we mltiply by pos bcz thats the value and  evaluate pos by Value upto (r-1) decimal places
		//r-1 bcz we are conside pos from 10^0 ->10^n-1

             value += place*(int)Math.pow(10,rem-1); //1*10^0 = 1  // 2*10^4 = 20000
             place++; //2

        }
            System.out.println(value);
       
	}
}

