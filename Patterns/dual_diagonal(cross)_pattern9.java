 import java.util.*;
      
      public class Main{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
      
         int n = scn.nextInt();
         
        
         
         for(int i=1; i<=n; i++){ //COntrols row from 1-5

			 for(int j=1;j<=n;j++){		//Controls each Col print wrt to condition
                 
                 if(i==j || i+j== n+1){  //i==j for left diagonal and i+j=n+1 is for right diagonal
                 System.out.print("*	");
                 
             }else{
                 System.out.print("	");
             }
             
             }
             
             
             
               System.out.println();
       
       }
      
        
         }
         
      }



	  