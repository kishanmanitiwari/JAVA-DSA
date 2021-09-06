     
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt(); //1234
        int rotate = fs.nextInt(); //1 ->Ans 4123

        //Part A -> Knowing num of Digits

       int temp = n;
       int ctr = 0;
       while(temp>0){
           temp=temp/10;
           ctr++;
       }
        
        //Part  B->  Handing large num and -ve num

        rotate = rotate%ctr; //Every ctr rotate=same num, eg 1234 by 4 -> 1234 
                             // So eg 12345 rotate by 152 is actually only 2 rotate    
        
        if(rotate<0) rotate +=ctr;  //Handling Negative Condition
                                    //Using +ve condition to tackle it
                                //Eg: For 1234
                                // -1 -> 2341 
                                // 3 -> 2341   (-1 rotation= 3 rotation)
            //So if we add the Num of Digits in -ve num it will act as the +ve Condition
            
        
        int ans=0;

        //Approach
        //1) Take the rem digit out w.r.t rotate
        //2) Take the Qt
        //3)Rem*10^(ctr-1)+Qt


       for(int i=0; i<rotate;i++){   // 1

            int rem = n%(int)Math.pow(10,rotate); //4
            int qt = n/(int)Math.pow(10,rotate); //123  

            int ans1 = rem*(int)Math.pow(10,ctr-1); //4*10^3 = 4000
            ans = qt+ans1; //4000+123
            ctr--;

       }
              System.out.println(ans);

         


	}
}

