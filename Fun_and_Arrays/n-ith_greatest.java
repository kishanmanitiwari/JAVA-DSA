import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num = 8493, max=-1;;

        int n = getDigitCount(num);

        
        int right_divisor = 1;

        for(int i=1;i<=n;i++){
            int temp = num; //8493
            int rem_dig = Math.abs(temp % (int)Math.pow(10,i-1)); //8493%1 = 0/ ---// 8493%10 = 3 // 8493%100 == 93 // 8493%1000 == 493

            int start_dig = Math.abs(temp / (int)Math.pow(10,i)); //8493/10 = 849 // 8493/100 = 84 // 8493/1000 = 8 /


            if(i>1) start_dig= start_dig*(int)Math.pow(10,i-1)+rem_dig; //84*10 =840+3

            if(start_dig>max) max=start_dig; //Comparing with max value

             
            
         }

             System.out.println(max);

    }   
       

    public static int getDigitCount(int num)
{
    int c = 0;
    while(num > 0){
        num/=10;
        c++;
    }
    return c;
}
}

