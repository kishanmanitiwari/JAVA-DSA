 import java.util.*;
      
      public class Main{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
      
         int n = scn.nextInt();

		 int space = n/2;
		 int innerSpace = -1;  //V.imp to initiaize from -1 because we do +=2 sp it goes to 1 for row 2
         
        
         
         for(int i=1; i<=n; i++){ //COntrols row from 1-5

		 for(int j=1;j<=space;j++){
			 System.out.print("\t");  //Print all the spaces

		 }
		 System.out.print("*\t");  //Only 1 star req so not keeping of track of stars seprately

		 for(int j=1;j<=innerSpace;j++){  	//then print inner space 
			  System.out.print("\t");		
		 }

		 if(i>1 && i<n){
			  System.out.print("*\t");  //for 1st and last row only 1 star else (2-4) 2 stars
		 }

		 if(i<=n/2){
			 space--;
			 innerSpace +=2;  

		 }else{
			 space++;
			 innerSpace -=2;

		 }

             
               System.out.println();
       
       }
      
        
         }
         
      }



	  