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

        int k = 0;

        for(int i=1; i<=n; i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){  //Print only the outer boundary
                    System.out.print((n*k)+j +"\t");  //5*0+1 = 5; 5*2+1 = 11 5*4+1 = 21 5*3+1 =15 5*1+1 =6
                }else{
                    System.out.print("*\t");
                }
                
               
            }

            if(n%2==0){ // if n is EVEN

                if(i<n/2){  //Less than mid col = increase by 2    <N/2 FOR EVEN 
                k += 2;
            }else if(i==n/2){
               
                    k +=1;  //for Mid INCREASE only by 1 N/2 IS MID FOR EVEN NUM 
                
                 
            }else{
                k -= 2;     //else decrease by 2 for n/2+1
            }

            } else{ //FOR ODD NUM

                if(i<=n/2){  //Less than mid col = increase by 2 <=N/2 FOR ODD
                k += 2;
            }else if(i==n/2+1){
                k -=1;  //for Mid decrease only by 1  N/2+1 IS MID FOR ODD
            }else{
                k -= 2;     //else decrease by 2 for n/2+1
            }

            }

            


            

            System.out.println();   
        }
	}
}

