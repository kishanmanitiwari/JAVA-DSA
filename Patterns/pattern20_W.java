import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

        Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==n){
                    System.out.print("*	");
                }else if(i>n/2 && (i==j || i+j==n+1)){
                    
                    System.out.print("*	");
                        }else{
                        
                    System.out.print("	");
                    }
                }

                System.out.println();
                    }                 
            }

            
                  
        }